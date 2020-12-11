package com.zingpay.zong.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Bilal Hassan on 11-Sep-2020
 * @project zong-integration-microservice
 */

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
public class ZongIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZongIntegrationApplication.class, args);
    }
}
