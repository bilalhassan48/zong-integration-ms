package com.zingpay.zong.integration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bilal Hassan on 11-Sep-2020
 * @project zong-integration-microservice
 */


@EnableSwagger2
@Component
@Primary
@EnableAutoConfiguration
public class SwaggerConfig implements SwaggerResourcesProvider {

    @Value("${server.ip}")
    private String serverIp;
    @Value("${zingpay.port}")
    private String zingpayPort;
    @Value("${zingpay.url}")
    private String zingpayUrl;
    @Value("${auth.port}")
    private String authPort;
    @Value("${auth.url}")
    private String authUrl;

    @Bean
    public Docket swagConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("ZingPay Microservice")
                .description("ZingPay Microservice")
                .build();
    }

    @Bean
    public RestTemplate configureTemplate() {
        return new RestTemplate();
    }

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
        resources.add(swaggerResource("Auth-Service", "http://"+serverIp+":"+authPort+authUrl+"/v2/api-docs", "2.0"));
        resources.add(swaggerResource("ZingPay-Service", "http://"+serverIp+":"+zingpayPort+zingpayUrl+"/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
