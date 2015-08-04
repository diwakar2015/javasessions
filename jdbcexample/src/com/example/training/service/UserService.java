package com.example.training.service;

import java.util.ArrayList;

import com.example.training.model.User;
import com.example.training.model.UserInfo;

public interface UserService {
	
	public void insertUser(User user);
	
	public User getUser(String userName);
	
	public UserInfo getUserInfo(String userName);
	
	public void updateUser(User user);
	
	public void updateUserInfo(UserInfo userInfo);
	
	
	public void deleteUser(String UserName);
	
	public ArrayList<User> getAllUser();
	
	public int inserUserInfo(UserInfo userInfo);
}
