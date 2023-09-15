package com.portal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={ "com.portal.api" })
public class ApiPortalApplication {

public static void main(String[] args) {
	SpringApplication.run(ApiPortalApplication.class, args);
}

}
