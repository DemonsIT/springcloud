package com.bjsxt.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/11 10:08
 * @Description:
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoError")
    public String getInfo(){
        return restTemplate.getForObject("http://springcloud-provider/getInfo",String.class);
    }

    public String getInfoError(){
        return "服务提供方出现故障！请核查";
    }
}
