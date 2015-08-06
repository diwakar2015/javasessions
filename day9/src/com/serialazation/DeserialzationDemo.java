/**
 * 
 */
package com.serialazation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *  @author Diwakar
 *
 * Date:  Aug 6, 2015 2015
 * File: DeserialzationDemo.java
 */
public class DeserialzationDemo {

	
	public static void main(String[] args) {
		
		
		try
		{
			
			FileInputStream fileIn = new FileInputStream("c:\\javademo\\emp.ser");
			ObjectInputStream in  = new ObjectInputStream(fileIn);
			
			Object obj = in.readObject();
			
			Employee emp = (Employee) obj;
			
			System.out.println("After retreiving : "+ emp);
			
			
		}
		catch(Exception e)
		{
			
			
		}
	}
	
	
}
