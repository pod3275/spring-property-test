package com.pod3275.example.controller;

import com.pod3275.example.service.ServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerV0 {
  
  @Autowired
  private ServiceBase serviceMvc;

  @GetMapping
  public ResponseEntity<Object> getPropertyVars(){
    serviceMvc.getPropertyVars();
    return new ResponseEntity<>("hello", HttpStatus.OK);
  }
}
