package com.example.training.dao;

import java.util.ArrayList;

import com.example.training.model.User;
import com.example.training.model.UserInfo;

public interface UserDAO {
	
	public void insertUser(User user);
	
	public int inserUserInfo(UserInfo userInfo);
	
	public User getUser(String userName);
	
	public UserInfo getUserInfo(String userName);
	
	public void updateUser(User user);
	
	public void updateUserInfo(UserInfo userInfo);
	
	public void deleteUser(String userName);
	
	public void deleteUserInfo(String userName);
	
	public ArrayList<User> getAllUser();
	
	
	

}
