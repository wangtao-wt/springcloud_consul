package com.pyas.springcloud.comsumer.client;

import com.pyas.springcloud.comsumer.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Author pyas-gys
 * @Date 2020/12/8 14:22
 * @Version 1.0
 */
@FeignClient(value = "consul-server", configuration = FeignConfig.class)
public interface ProducerClient {
    @GetMapping({"/hello"})
    String hello();
}
