package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String aaa() {

        return "aaa";
    }
}
