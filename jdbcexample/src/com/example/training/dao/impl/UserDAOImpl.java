package com.example.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.training.connectionfactory.ConnectionManager;
import com.example.training.dao.UserDAO;
import com.example.training.model.User;
import com.example.training.model.UserInfo;


public class UserDAOImpl  implements UserDAO{

	@Override
	public void insertUser(User user) {


		try
		{
			Connection connection = ConnectionManager.getConnection();

			String sql = "INSERT INTO user (username, password) VALUES (?, ?)";


			// First Way, using the prepared statement

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());

			int rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while inserting the data into the DB"+ e);
		}

		// Second way, using statement


	}

	@Override
	public User getUser(String userName) {

		User user = null;
		try
		{
			Connection connection = ConnectionManager.getConnection();

			String sql = "SELECT * FROM user where username='"+userName+"'";

			Statement statement = connection.createStatement();



			ResultSet result = statement.executeQuery(sql);



			while (result.next())
			{
				String name = result.getString(1);
				String pass = result.getString(2);

				user = new User(name,pass);

			}
		}
		catch(Exception e)
		{
			System.out.println("Exception e"+ e);
		}

		return user;
	}

	@Override
	public void updateUser(User user) {

		try
		{
			Connection conn = ConnectionManager.getConnection();

			String sql = "UPDATE USER SET password = ? WHERE username = ?";

			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, user.getPassword());
			statement.setString(2, user.getUserName());

			int rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("A new user was UPDATED successfully!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while UPDATING the data into the DB"+ e);
		}

	}


	@Override
	public void updateUserInfo(UserInfo userInfo) {
		
		try
		{
			Connection conn = ConnectionManager.getConnection();

			String sql = "UPDATE userinfo SET name = ?, city = ?, email = ? WHERE username = ?";

			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, userInfo.getName());
			statement.setString(2, userInfo.getCity());
			statement.setString(3, userInfo.getEmail());
			statement.setString(4, userInfo.getUserName());

			int rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("A USERINFO table was UPDATED successfully!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while UPDATING the data into the DB"+ e);
		}
		

	}


	@Override
	public void deleteUser(String UserName) {


	}

	@Override
	public ArrayList<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserUserInfo(UserInfo userInfo) {
		int rowsInserted = 0;

		try
		{
			Connection connection = ConnectionManager.getConnection();

			String sql = "INSERT INTO userinfo (username, name, city, email) VALUES (?, ?, ? , ?)";


			// First Way, using the prepared statement

			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, userInfo.getUserName());
			statement.setString(2, userInfo.getName());
			statement.setString(3, userInfo.getCity());
			statement.setString(4, userInfo.getEmail());


			rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
				System.out.println("User Information inserted successfully!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught while inserting the data into the DB"+ e);
		}
		return rowsInserted;
	}

	@Override
	public UserInfo getUserInfo(String userName) {

		System.out.println("Get UserInfo "+ userName);
		UserInfo userInfo = null;
		try
		{
			Connection connection = ConnectionManager.getConnection();

			String sql = "SELECT * FROM userinfo where username='"+userName+"'";

			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(sql);

			while (result.next())
			{
				String uName = result.getString(1);
				String name = result.getString(2);
				String city = result.getString(3);
				String email = result.getString(4);

				userInfo = new UserInfo(uName, name, city, email);

			}
		}
		catch(Exception e)
		{
			System.out.println("Exception e while getting userInfo "+ e);
		}

		return userInfo;
	}



	@Override
	public void deleteUserInfo(String userName) {
		// TODO Auto-generated method stub

	}

}
