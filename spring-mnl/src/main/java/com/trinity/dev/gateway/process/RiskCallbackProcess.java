/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.process;


import java.util.Arrays;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author oiprado
 */
@Component
public class RiskCallbackProcess implements Processor {

    @Value("${rest.risk.uri}")
    private String uri;
//    @Value("${rest.login.clientId}")
//    private String cliendId;
//    @Value("${rest.login.clientSecret}")
//    private String cliendSecret;
//    @Value("${rest.login.basic}")
//    private String basic;
    private RestTemplate restTemplate;
    
    
    @Override
    public void process(Exchange exchange) throws Exception {
        
        Integer riskTypeId=1;
        Integer organizationId=1;
        String description="";
        String lat="";
        String lng="";
        String municipalityCode="";
        String alertLevel="";
        String username="";
        
        
        restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> request = new HttpEntity<>(headers);
        uri = String.format(uri, riskTypeId, organizationId, description, lat, lng, municipalityCode, alertLevel, username);
//        ResponseEntity entity = restTemplate.exchange(uri, HttpMethod.POST, request);        
        
//        restTemplate.exchange(uri, HttpMethod.POST, request, type, headers);
        

    }

}
