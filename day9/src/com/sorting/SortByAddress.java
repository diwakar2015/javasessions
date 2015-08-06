/**
 * 
 */
package com.sorting;

import java.util.Comparator;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: SortByAddress.java
 */
public class SortByAddress implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.address.compareTo(o2.address);
	}

}
