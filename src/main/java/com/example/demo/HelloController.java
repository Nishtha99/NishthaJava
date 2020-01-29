package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/abc")
	public String hello(){
		return "Hello";
	}
	
	@RequestMapping("/hello-world")
	public HelloWorldBean GetWorld(){
		return new HelloWorldBean();
	}
	
	@RequestMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean getgreeting(@PathVariable("name") String name)
	{
		return new HelloWorldBean(name);
	}
	}
	

 

