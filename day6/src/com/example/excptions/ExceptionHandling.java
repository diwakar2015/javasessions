package com.example.excptions;

import java.util.Scanner;

public class ExceptionHandling {




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int age=0;

		try
		{
			System.out.println("Please enter your age");
			age = sc.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println("Wrong age entred "+ ex.getMessage());
		}
		
	//
		
		System.out.println("Please enter your name");
		
		String name = sc.nextLine();

		System.out.println("Your age is "+ age);
		System.out.println("Your name is "+ name);




	}


}
