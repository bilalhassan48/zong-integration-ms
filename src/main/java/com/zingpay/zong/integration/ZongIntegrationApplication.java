package com.zingpay.zong.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Bilal Hassan on 11-Sep-2020
 * @project zong-integration-microservice
 */

@SpringBootApplication
@EnableSwagger2
public class ZongIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZongIntegrationApplication.class, args);
    }
}
