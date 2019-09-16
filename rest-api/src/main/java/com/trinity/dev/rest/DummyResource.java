/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.rest;

import com.trinity.dev.dto.Image;
import com.trinity.dev.dto.Risk;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oiprado
 */
@RestController
@RequestMapping("/dummy")
public class DummyResource {
    
    @CrossOrigin
    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> uploadFile(@RequestBody Image image) {
        return new ResponseEntity<>(new Risk("dry_grass") ,HttpStatus.ACCEPTED);
    }
    
}
