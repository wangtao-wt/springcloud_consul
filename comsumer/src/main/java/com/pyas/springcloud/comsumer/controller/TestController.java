package com.pyas.springcloud.comsumer.controller;

import com.pyas.springcloud.comsumer.client.ProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author pyas-gys
 * @Date 2020/12/8 14:28
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    private ProducerClient producerClient;
    @GetMapping("/test")
    public void test() {
        System.out.println(producerClient.hello());
    }
}
