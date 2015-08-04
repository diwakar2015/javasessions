package com.example.training.myapp;

import java.util.Scanner;

import com.example.training.model.User;
import com.example.training.model.UserInfo;
import com.example.training.service.impl.UserServiceImpl;

public class MyUserApplication {

	public static void main(String[] args) {

		displayMainMenu();

	}

	public static void displayMainMenu()
	{

		System.out.println("\n\n***********JDBC Example *******************");
		Scanner sc = new Scanner(System.in);

		UserServiceImpl userService = new UserServiceImpl();

		AppCaseHandler appCase = new AppCaseHandler();

		System.out.println("Select you choice");

		System.out.println("1. To Add new user");
		System.out.println("2. To add user infomation");
		System.out.println("3. To Update a user");
		System.out.println("4. To Delete a user");
		System.out.println("5. To See a  user");
		System.out.println("6. To see all the users and their info");
		System.out.println("7. To Exit");
		int choice = sc.nextInt();

		switch(choice)
		{

		case 1:
			appCase.insertUser();
			displayMainMenu();
			break;

		case 2:
			appCase.insertUserInfo();
			displayMainMenu();
			break;

		case 3:
			appCase.updateUser();
			displayMainMenu();
			break;

		case 4:
			System.out.println("Delete the user alsong with user info table as well.");
			break;

		case 5:
			System.out.println("Enter the username to find the user details");
			String userName = sc.next();
			appCase.getUser(userName);
			displayMainMenu();
			break;

		case 6:
			System.out.println("List all the user and user Info details.");
			break;

		case 7:
			System.exit(0);;
			break;

		default:
			System.out.println("Wrong Choice, Select again!");
			displayMainMenu();
			break;

		}



	}



}
