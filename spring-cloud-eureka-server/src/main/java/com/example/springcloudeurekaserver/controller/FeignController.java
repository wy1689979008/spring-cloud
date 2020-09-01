package com.example.springcloudeurekaserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FeignController {
    @ResponseBody
    @GetMapping("/aaa")
    public String testFeign(){
        return "FeignTest";
    }
}
