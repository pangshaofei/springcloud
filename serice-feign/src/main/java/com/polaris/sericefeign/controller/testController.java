package com.polaris.sericefeign.controller;

import com.polaris.sericefeign.client.ClientDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class testController {

        @Autowired
        ClientDemo clientDemo;

        @GetMapping(value = "api/msg")
        public String msg(@RequestParam String name) {
            return clientDemo.msg( name );
        }

}
