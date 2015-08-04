package com.example.training.service.impl;

import java.util.ArrayList;

import com.example.training.dao.impl.UserDAOImpl;
import com.example.training.model.User;
import com.example.training.model.UserInfo;
import com.example.training.service.UserService;

public class UserServiceImpl implements UserService{

	UserDAOImpl userDAO = new UserDAOImpl();
	
	
	@Override
	public void insertUser(User user) {
		userDAO.insertUser(user);
		
	}

	@Override
	public User getUser(String userName) {
		
		return userDAO.getUser(userName);
	}

	@Override
	public void updateUser(User user) {
		
		userDAO.updateUser(user);
		
	}

	@Override
	public void deleteUser(String UserName) {
		
		userDAO.deleteUser(UserName);
		
	}

	@Override
	public ArrayList<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserUserInfo(UserInfo userInfo) {
		
		return userDAO.inserUserInfo(userInfo);
		
	}

	@Override
	public UserInfo getUserInfo(String userName) {
		return userDAO.getUserInfo(userName);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		userDAO.updateUserInfo(userInfo);
		
	}
	
	

}
