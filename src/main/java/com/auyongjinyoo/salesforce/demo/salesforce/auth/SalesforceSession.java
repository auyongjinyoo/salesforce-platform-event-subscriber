package com.auyongjinyoo.salesforce.demo.salesforce.auth;

public record SalesforceSession (
        String accessToken,
        String orgId,
        String instanceUrl
){}

