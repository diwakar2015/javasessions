/**
 * 
 */
package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: Student.java
 */
public class Student implements Comparable<Student> {
	
	int roll;
	String name;
	
	
	

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}


	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}
	
	public String toString()
	{
		return "Role : "+ roll + " name "+name;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		
		stdList.add(new Student(5, "s1"));
		stdList.add(new Student(4, "s5"));
		stdList.add(new Student(1, "s2"));
		stdList.add(new Student(3, "s4"));
		
		
		System.out.println("Before sorting...");
		
		for(Student std : stdList)
			System.out.println(std);
		
		System.out.println("\n\n ========Sorting by name=============");
		Collections.sort(stdList);
		
		for(Student std : stdList)
			System.out.println(std);
	}

}
