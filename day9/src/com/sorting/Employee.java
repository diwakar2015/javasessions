/**
 * 
 */
package com.sorting;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: Employee.java
 */
public class Employee {
	
	String empName;
	Integer empAge;
	String address;
	
	public Employee(String empName, Integer empAge, String address) 
	{
		this.empName = empName;
		this.empAge = empAge;
		this.address = address;
	}

	public String toString()
	{
		return "Name : "+ empName + " Age :"+empAge + " Address :"+address;
	}

}
