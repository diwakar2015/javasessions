package com.example.training.myapp;

import java.util.Scanner;

import com.example.training.model.User;
import com.example.training.model.UserInfo;
import com.example.training.service.impl.UserServiceImpl;

public class AppCaseHandler {

	Scanner sc = new Scanner(System.in);

	UserServiceImpl userService = new UserServiceImpl();

	public void insertUser()
	{
		System.out.println("Enter the username and password to save in database");
		String uName = sc.next();
		String password = sc.next();
		User user = new User(uName, password);
		userService.insertUser(user);
		System.out.println("User added successfully!!");

	}

	public void insertUserInfo()
	{
		int noOfRowInserted = 0;
		System.out.println("Enter the username, name, city and email");

		String uName = sc.next();
		String name = sc.next();
		String city = sc.next();
		String email = sc.next();

		UserInfo userInfo = new UserInfo(uName, name, city, email);

		User user = userService.getUser(uName);
		if(user!=null)
		{
			noOfRowInserted = userService.inserUserInfo(userInfo);
			if(noOfRowInserted>0)
			{
				System.out.println("User Info added successfully!!");
			}
			else
			{
				System.out.println("Some issue occured while inserting the data into the user info table");
			}


		}
		else
		{
			System.out.println("No such user name " + uName +" found in the database");

		}


	}


	public User getUser(String userName)
	{
		User getUser = userService.getUser(userName);
		System.out.println("User retrieved from User database:=> UserName: "+ getUser.getUserName() + " Password : "+ getUser.getPassword());
		return getUser;

	}


	public void updateUser()
	{

		System.out.println("Enter the user name");
		String uname = sc.next();

		User user = userService.getUser(uname);

		UserInfo userInfo = userService.getUserInfo(uname);

		if(user==null || userInfo == null)
		{
			System.out.println("User not found!!");
		}
		else
		{
			System.out.println("Retrieve details: ");

			System.out.println("User : "+ user.toString());
			System.out.println("Unser Info : "+ userInfo.toString());


			System.out.println("Which field you want to update?");
			System.out.println("1. To Password");
			System.out.println("2. To Name");
			System.out.println("3. To City");
			System.out.println("4. To Email");

			int ch = sc.nextInt();



			switch (ch) {
			case 1:
				System.out.println("Enter the new password");
				String pwd = sc.next();
				user.setPassword(pwd);
				break;

			case 2:
				System.out.println("Enter the new name");
				String name = sc.next();
				userInfo.setName(name);
				break;
			case 3:
				System.out.println("Enter the new city");
				String city = sc.next();
				userInfo.setCity(city);
				break;
			case 4:
				System.out.println("Enter the new mail");
				String mail = sc.next();
				userInfo.setEmail(mail);
				break;

			default:
				break;
			}

			userService.updateUser(user);
			userService.updateUserInfo(userInfo);
			System.out.println("Updated!! ");

		}



	}


}
