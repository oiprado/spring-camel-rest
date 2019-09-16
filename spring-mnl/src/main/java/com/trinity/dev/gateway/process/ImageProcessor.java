/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.process;

import java.io.InputStream;
import javax.activation.DataHandler;
import javax.mail.internet.MimeBodyPart;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

/**
 *
 * @author oiprado
 */
@Component
public class ImageProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        
        InputStream is = exchange.getIn().getBody(InputStream.class);
        MimeBodyPart mimeMessage = new MimeBodyPart(is);
        DataHandler dh = mimeMessage.getDataHandler();
        
        exchange.getOut().setBody(dh.getInputStream());
    }

}
