/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.process;

import com.trinity.dev.gateway.dto.MLResponse;
import com.trinity.dev.gateway.dto.RiskType;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 *
 * @author oiprado
 */
@Component
public class ResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        
        MLResponse response =  exchange.getIn().getBody(MLResponse.class);
        
        RiskType riskType;
        
        switch(response.getResponse()){
            case "dry_grass": {
                riskType = new RiskType(1);
                break;
            }
            default:{
                riskType = new RiskType(-1);
            }
        }
        
        exchange.getOut().setBody(riskType);
    }
    
}
