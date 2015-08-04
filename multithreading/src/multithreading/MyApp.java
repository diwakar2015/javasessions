package multithreading;

public class MyApp {
	
	public static void main(String[] args) {
	
		
		for(int i=1; i<=3 ; i++)
		{
			
			User user= new User();
			user.setPassword("password"+i);
			user.setUserName("User-"+i);
			
			LoginValidtor thread = new LoginValidtor(); // new 
			thread.user= user;
			thread.setName("Thread-"+i);
			
			//System.out.println("Submitting the thread to TS for user "+ user.getUserName());
			thread.start(); // this is now in RUNNABLE state and submitted to TS 100 Thrreads
			
		}
		
	//	System.out.println("5 successfull users have already requted login....");
		
		User userWrong= new User();
		userWrong.setPassword("password");
		userWrong.setUserName("WrongName");
		
		LoginValidtor thread = new LoginValidtor(); // new 
		thread.user= userWrong;
		thread.setName("Thread-User-Wrong");
		
		//System.out.println("Submitting the thread to TS for user "+ user.getUserName());
		thread.start(); 
		
		
		
	/*	User user= new User();
		user.setPassword("password1");
		user.setUserName("User-1");
		
		LoginValidtor thread = new LoginValidtor();
		thread.user= user;
		
		thread.run();
		
		
		user.setPassword("password2");
		user.setUserName("User-2");
		
		LoginValidtor thread2= new LoginValidtor();
		thread2.user= user;
		
		thread2.run();
		*/
	}

}
