package com.polaris.testserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @Value("${server.port}")
    String port;
    @Value("${vision}")
    String msg;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "polaris") String name) {
        return "hi " + name + " ,i am from port:" + port+"vision"+msg;
    }
}
