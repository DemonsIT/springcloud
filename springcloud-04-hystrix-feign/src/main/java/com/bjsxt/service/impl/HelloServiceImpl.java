package com.bjsxt.service.impl;

import com.bjsxt.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/11 10:25
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService{
    public String getInfo(){
        return "服务提供方出现故障，请核查！";
    }
}
