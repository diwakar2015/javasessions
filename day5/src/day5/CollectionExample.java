package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample {
	
	
	public static void main(String[] args) {
		
		
		//Student studentList[]  = new Student[100];
		
		//int arr[] = new int[100];
		
		
		
		ArrayList<String> studentList = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students");
		int noOfStudnets = sc.nextInt();
		
		for(int i=1 ; i<=noOfStudnets; i++)
		{
			
			studentList.add("Shiva");
			
		}
		
		
		System.out.println("Prinint the numbers");
		
		for(int i=0 ; i<=studentList.size()-1; i++)
		{
			System.out.println("Prining the student number : "+ studentList.get(i));
			
		}
		
		
		
		
		
	}
	

}
