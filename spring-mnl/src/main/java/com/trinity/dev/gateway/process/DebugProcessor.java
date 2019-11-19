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
public class DebugProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        Object body = exchange.getIn().getBody();
        
//        System.out.println(body);       
        
        exchange.getOut().setHeaders(exchange.getIn().getHeaders());
        exchange.getOut().setBody(body);
        
    }

}
