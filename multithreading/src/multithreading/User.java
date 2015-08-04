package multithreading;

import java.util.ArrayList;

 class UserList {
	
	public static final ArrayList<User> userList = new ArrayList<User>();

	static
	{
		for(int i=1; i<=100; i++)
		{
			User user = new User();
			user.setPassword("password"+i);
			user.setUserName("User-"+i);
			
			userList.add(user);
		}
			

	}
	
	
	public static ArrayList<User> getUserList()
	{
		return userList;
	}
	
}
 
 class User
 {
	 
	
	 private String userName;
	 private String password;
	 
	 
	
	 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	
 }
