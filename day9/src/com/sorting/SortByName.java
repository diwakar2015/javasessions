/**
 * 
 */
package com.sorting;

import java.util.Comparator;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: SortByName.java
 */
public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empName.compareTo(o2.empName);
	}
	

}
