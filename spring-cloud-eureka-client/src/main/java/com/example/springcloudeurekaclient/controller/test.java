package com.example.springcloudeurekaclient.controller;

import com.example.springcloudeurekaclient.service.FeignService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class test {

    @Autowired
    private EurekaClient discoveryClient;
    @Autowired
    private FeignService feignService;

    @ResponseBody
    @RequestMapping("/aaa")
    public String serviceUrl() {
        String s = feignService.FeignServoce();
        System.out.println(s);
        return s;
    }
}
