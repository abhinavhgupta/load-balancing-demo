package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "helloworld", configuration = Configuration.class)
public class LoadBalancingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancingDemoApplication.class, args);
	}

}
