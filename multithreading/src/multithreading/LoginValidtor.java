package multithreading;

import java.util.ArrayList;

public class LoginValidtor extends Thread{
	
	User user;
	
	public void validateUser()
	{
		
		User user = this.user;
		System.out.println("Inside validateUser method ()  ==> User Name :"+ user.getUserName() + " Password "+ user.getPassword()+ " by "+ Thread.currentThread().getName());
		
		ArrayList<User> userList = UserList.getUserList();
		
		boolean flag = false;
		
		for(User userInfo : userList)
		{
			if(userInfo.getUserName().equals(user.getUserName()) && userInfo.getPassword().equals(user.getPassword()))
			{
				verifiedUser();
				
				flag = true;
			}
			
		}
		
		if(flag == false)
		{
			error();
		}
		
		
		
	}
	
	
	public void verifiedUser()
	{
		
		System.out.println("Login Sucessfull!!! You are a verified user, you can access the site now. Thread Name: "+Thread.currentThread().getName() );
		
	}
	
	public void error()
	{
		System.out.println("Login Failed!! You have provided wrong userName and Password Thread Name: "+ Thread.currentThread().getName());
	}
	
	// This is called by the Thread Scheduler, and it will be called only when thread.start() is called on that thread.
	
	public void run()
	{
		System.out.println("I am in RUNNING state now..and now calling validateUser method.."+ Thread.currentThread().getName());
		validateUser();
	}
	

	

}
