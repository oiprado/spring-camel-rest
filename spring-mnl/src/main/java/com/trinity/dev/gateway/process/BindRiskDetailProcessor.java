/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.process;

import com.trinity.dev.gateway.dto.MLResponse;
import com.trinity.dev.gateway.dto.RiskDetail;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 *
 * @author oiprado
 */
@Component
public class BindRiskDetailProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        MLResponse value = exchange.getIn().getBody(MLResponse.class);
        
//        @RequestParam("riskTypeId") Integer riskTypeId, 
//		@RequestParam("organizationId") Integer organizationId,
//		@RequestParam("description") String description, 
//		@RequestParam("lat") Double lat,  
//		@RequestParam("lng") Double lng,
//		@RequestParam("municipalityCode") String municipalityCode,
//		@RequestParam("alertLevel") String alertLevel,
//                @RequestParam("username") String username,
//		@RequestHeader("file") MultipartFile file
        
        Integer riskTypeId = exchange.getIn().getHeader("riskTypeId", Integer.class);
        Integer organizationId = exchange.getIn().getHeader("organizationId", Integer.class);
        String description = "Capture By AI";
        Double lat = exchange.getIn().getHeader("lat", Double.class);
        Double lng = exchange.getIn().getHeader("lng", Double.class);
        String municipalityCode = exchange.getIn().getHeader("municipalityCode", String.class);
        String alertLevel = "A"; //By Default
        String username = exchange.getIn().getHeader("username", String.class);
        String image = exchange.getIn().getHeader("image", String.class);
        
        exchange.getOut().setBody(new RiskDetail(riskTypeId, organizationId, description, lat, lng, municipalityCode, alertLevel, username, image));
    }
    
}
