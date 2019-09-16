/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.route;

import com.trinity.dev.gateway.process.DebugProcessor;
import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author oiprado
 */
public class FileRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("").unmarshal().mimeMultipart().split().attachments()
        .process(new DebugProcessor());
    }
    
}
