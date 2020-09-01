package com.example.springcloudzookeeper.interfance;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("newsletter")
public interface service {
    @RequestMapping(method = RequestMethod.GET, value = "/newsletter")
    String getNewsletters();
}
