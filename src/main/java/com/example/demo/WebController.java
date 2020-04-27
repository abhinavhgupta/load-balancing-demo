package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {
	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/")
	public String home() {
		return "Okay";
	}
	@RequestMapping("/greeting")
	public String hello() {
		return "hello";
	}
}
