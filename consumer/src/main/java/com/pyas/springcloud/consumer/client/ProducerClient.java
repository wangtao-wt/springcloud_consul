package com.pyas.springcloud.consumer.client;

import com.pyas.springcloud.consumer.config.FeignConfig;
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


    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2))
            {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + "" +y + "" +k);
    }
}
