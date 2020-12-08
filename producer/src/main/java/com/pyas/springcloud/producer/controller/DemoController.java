package com.pyas.springcloud.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author pyas-gys
 * @Date 2020/12/8 11:15
 * @Version 1.0
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
