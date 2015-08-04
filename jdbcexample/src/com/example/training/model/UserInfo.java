package com.example.training.model;

public class UserInfo {
	
	private String userName;
	private String name;
	private String city;
	private String email;
	
	public UserInfo(String userName, String name, String city, String email) {
		super();
		this.userName = userName;
		this.name = name;
		this.city = city;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
	{
		
		return "Name : "+ name + " City : "+ city + " E-Mail : "+ email;
		
	}
	

}
