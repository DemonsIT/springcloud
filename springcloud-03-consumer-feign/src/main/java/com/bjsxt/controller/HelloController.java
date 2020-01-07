package com.bjsxt.controller;

import com.bjsxt.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Victor Wu
 * @Date: 2018/12/11 09:15
 * @Description:
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/getInfo")
    @ResponseBody
    public String getInfo(){
        return  helloService.getInfo();
    }
}
