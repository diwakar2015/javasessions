package day4;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		
		int rollNumbers[] = new int[20];
		
		String names[] = new String[20];
		
		boolean isPassed[] = new boolean[20]; 
	
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=3; i++)
		{
			
			System.out.println("Enter the roll number of student");
			int roll = sc.nextInt();
			
			rollNumbers[i] = roll;
			
			
			System.out.println("Enter the name number of student");
			String name = sc.next();
			
			names[i] = name;
			
		}
		
		
		System.out.println("\n\n\nPrinint the Stident details now...");
		
		for(String i : names)
		{
			System.out.println("Name :"+ i);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
