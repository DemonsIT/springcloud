package com.bjsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/10 16:56
 * @Description:
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;


    public String getInfo(){
        return restTemplate.getForObject("http://springcloud-provider/getInfo",String.class);
    }
}
