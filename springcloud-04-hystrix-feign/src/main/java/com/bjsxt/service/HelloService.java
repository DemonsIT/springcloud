package com.bjsxt.service;

import com.bjsxt.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/11 09:12
 * @Description:
 */
@FeignClient(value = "springcloud-provider",fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping("/getInfo")
    String getInfo();
}
