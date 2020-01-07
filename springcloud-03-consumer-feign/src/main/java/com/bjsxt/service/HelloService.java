package com.bjsxt.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/11 09:12
 * @Description:
 */
@FeignClient("springcloud-provider")
public interface HelloService {
    @RequestMapping("/getInfo")
    String getInfo();
}
