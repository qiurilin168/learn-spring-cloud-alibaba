package com.example.client.myfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("demo")
public interface TestClient {

    @RequestMapping("/hello")
    String hello();

}
