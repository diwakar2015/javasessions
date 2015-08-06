/**
 * 
 */
package com.serialazation;

import java.io.Serializable;

/**
 *  @author Diwakar
 *
 * Date:  Aug 6, 2015 2015
 * File: Employee.java
 */
public class Employee implements Serializable{
	
	int id;
	String name;
	String city;
	transient String password;
	
	


	
	public Employee(int id, String name, String city, String pwd) {

		this.id = id;
		this.name = name;
		this.city = city;
		this.password = pwd;
	}
	
	public String toString()
	{
		return "Employee Details : "+ id +" "+ name + " "+ city + " "+ password;
	}
	
}
