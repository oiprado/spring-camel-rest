/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 *
 * @author oiprado
 */
@Component
public class ValidateRequestProcessor implements Processor {
    
    @Override
    public void process(Exchange exchange) throws Exception {
        
        Object body = exchange.getIn().getBody();
        
        exchange.getOut().setHeader("riskTypeId", exchange.getIn().getHeader("riskTypeId"));
        exchange.getOut().setHeader("organizationId", exchange.getIn().getHeader("organizationId"));
        exchange.getOut().setHeader("description", exchange.getIn().getHeader("id"));
        exchange.getOut().setHeader("lat", exchange.getIn().getHeader("lat"));
        exchange.getOut().setHeader("lng", exchange.getIn().getHeader("lng"));
        exchange.getOut().setHeader("municipalityCode", exchange.getIn().getHeader("municipalityCode"));
        exchange.getOut().setHeader("alertLevel", exchange.getIn().getHeader("alertLevel"));
        exchange.getOut().setHeader("username", exchange.getIn().getHeader("username"));
        
//        exchange.getOut().setBody(true);
        exchange.getOut().setBody(body);
    }

}
