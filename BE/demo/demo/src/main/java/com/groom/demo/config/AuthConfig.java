package com.groom.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "auth")
@Getter
@Setter
public class AuthConfig {

    private String serverUrl;

    private String redirectUrl;

    private Map<String, Credentials> credentials;
}