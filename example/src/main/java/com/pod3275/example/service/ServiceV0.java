package com.pod3275.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@PropertySource("classpath:example.properties")
public class ServiceV0 implements ServiceBase {

  @Autowired
  public ServiceV0(@Value("${value}") String value){
    log.info("Service class generate: " + value);
  }

  @Value("${value}")
  String methodValue;

  @Override
  public void getPropertyVars() {
    log.info(methodValue);
  }
  
}
