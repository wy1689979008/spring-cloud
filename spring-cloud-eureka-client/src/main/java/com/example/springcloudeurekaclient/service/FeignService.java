package com.example.springcloudeurekaclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eurekaServer1" ,url = "server1:8761")
public interface FeignService {
    @RequestMapping(method = RequestMethod.GET,value = "/aaa")
    String FeignServoce();
}
