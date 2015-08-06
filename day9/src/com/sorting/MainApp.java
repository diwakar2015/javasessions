/**
 * 
 */
package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: MainApp.java
 */
public class MainApp {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		
		Employee e1 = new Employee("Diwakar", 25, "Bangalore");
		Employee e2 = new Employee("Shiva", 25, "USA");
		Employee e3 = new Employee("XYZ", 20, "India");
		Employee e4 = new Employee("PQR", 18, "UK");
		Employee e5 = new Employee("MNO", 30, "Hyd");
		Employee e6 = new Employee("ABC", 14, "ManU");
		
		empList.add(e1); empList.add(e2); empList.add(e3); empList.add(e4); empList.add(e5); empList.add(e6); 
		
		System.out.println("Before sorting the employee list");
		
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		System.out.println("\n\n==============Sorting based on Name:================ ");
		
		Collections.sort(empList, new SortByName());
		
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		
	System.out.println("\n\n==============Sorting based on AGE:================ ");
		
		Collections.sort(empList, new SortByAge());
		
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		
	System.out.println("\n\n==============Sorting based on Address:================ ");
		
		Collections.sort(empList, new SortByAddress());
		
		for(Employee emp : empList)
		{
			System.out.println(emp);
		}
		
		
		
		
			
	}
}
