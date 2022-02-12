package com.example.springbootcloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayService {
    @GetMapping("/")
    public String test(){
        return "this is GateWay";
    }
}
