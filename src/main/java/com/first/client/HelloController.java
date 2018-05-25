package com.first.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi() {
        return port + " 端口为您服务！";
    }
}
