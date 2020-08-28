package com.example.springcloudeurekaclient.controller;

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

    @ResponseBody
    @RequestMapping("/aaa")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("server1", false);
        return instance.getHomePageUrl();
    }
}
