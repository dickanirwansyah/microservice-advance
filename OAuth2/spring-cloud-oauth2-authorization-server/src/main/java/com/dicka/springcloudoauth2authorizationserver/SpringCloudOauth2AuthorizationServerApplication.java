package com.dicka.springcloudoauth2authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class SpringCloudOauth2AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2AuthorizationServerApplication.class, args);
	}
}

