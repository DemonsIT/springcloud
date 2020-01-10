package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Springcloud02Provider01Application {

	public static void main(String[] args) {

		SpringApplication.run(Springcloud02Provider01Application.class, args);
	}

	@RequestMapping("/getInfo")
	public String getInfo(){
		return "I'm provider-01, my address is localhost:8081";
	}
}
