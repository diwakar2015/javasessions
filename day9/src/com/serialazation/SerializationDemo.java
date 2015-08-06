/**
 * 
 */
package com.serialazation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *  @author Diwakar
 *
 * Date:  Aug 6, 2015 2015
 * File: SerializationDemo.java
 */
public class SerializationDemo {
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Siva", "Chicago", "mypass");
		

		
		System.out.println("Before persisteing : "+ emp);
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("c:\\javademo\\emp.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(emp);
			
			out.close();
			fileOut.close();
			
			System.out.println("Employee details persidted");
			
		}
		catch(Exception e)
		{
			
			System.out.println("Exception e "+ e);
		}
			
	}
	

}
