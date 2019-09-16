/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.rest;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.trinity.dev.dto.RiskDetail;
import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author oiprado
 */
@RestController
@RequestMapping("/public/risk")
public class PublicRiskResource {
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JSONPObject> saveMobile(@RequestHeader("files") MultipartFile files) {
        return new ResponseEntity(HttpStatus.CREATED);
    }
    
    @CrossOrigin
    @RequestMapping(value = "/saveML", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity<JSONPObject> saveMobile(@RequestBody RiskDetail riskDetail) throws IOException {
        
        System.err.println("");
        
      return new ResponseEntity(HttpStatus.CREATED);
        
    }
    
}
