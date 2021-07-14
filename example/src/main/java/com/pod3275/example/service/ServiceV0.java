package com.pod3275.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@PropertySource("classpath:config/${spring.profiles.active}/example.properties")
public class ServiceV0 implements ServiceBase {

  @Value("${value}")
  String methodValue;

  @Value("${spring.profiles.active}")
  String profile;

  @Autowired
  public ServiceV0(@Value("${spring.profiles.active}") String profile, 
  @Value("${value}") String value,
  @Value("${server.port}") String port,
  @Value("${min}")String minyes){
    
    log.info("profile={}, Service class generate: {}" , profile, value);
    log.info("{}, {}", port, minyes);
  }

  @Override
  public void getPropertyVars() {
    log.info(methodValue);
  }
  
}
