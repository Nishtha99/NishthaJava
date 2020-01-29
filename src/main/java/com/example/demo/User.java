package com.example.demo;

import java.sql.Date;

public class User {
	private int id;
	private String name;
	private Date DateOfBirth;
	
	public User(int user_id)
	{
		this.id= user_id;
	}
	
	public User(int user_id, String user_name)
	{
		this.id= user_id;
		this.name= user_name;
	}
	
	public User(int user_id, String user_name, Date dob )
	{
		this.id= user_id;
		this.name= user_name;
		this.DateOfBirth = dob;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id= id;
	}

}
