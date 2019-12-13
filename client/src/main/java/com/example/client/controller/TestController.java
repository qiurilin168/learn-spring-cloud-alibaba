package com.example.client.controller;


import com.example.client.myfeign.TestClient;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestClient testClient;


    @Autowired
    private TestService testService;


    @RequestMapping("test")
    public String test() {
        return testClient.hello();
    }

    @RequestMapping("test1")
    public String test1() {
        return testService.aaa();
    }


}
