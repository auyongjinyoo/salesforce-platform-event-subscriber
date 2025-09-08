package com.auyongjinyoo.salesforce.demo.salesforce.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "salesforce.security")
@Component
@Data
public class SalesforceSecurityProperties {
    private String grantType;
    private String clientID;
    private String clientSecret;
    private String userName;
    private String password;
}