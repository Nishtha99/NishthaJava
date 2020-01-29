package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldBean {
	private String message= " Hi from bean";
	
	public HelloWorldBean()
	{
		message="Constructor works";
	}
	public HelloWorldBean(String msg)
	{
		this.message= msg;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String msg)
	{
		this. message= msg;
	}

	@Override
	public String toString()
	{
		return "HelloworldBean [message="+message+"]";
	}

}
