package multithreading.callable;

import java.util.Random;

public class PhoneManufacture {
	
	public static final Object lock = new Object();

	public String buildMobile()
	{
		
		synchronized (lock) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10);

		System.out.println("Building the mobile...by "+ Thread.currentThread().getName());

		try
		{
			Thread.sleep(1000);

			if(randomNumber == 2)
			{
				throw new NullPointerException();
			}
		}
		catch(Exception e)
		{
			System.out.println("Failed because of some exception and Random value was => "+ randomNumber + " tHREAD WHICH FAILED : "+ Thread.currentThread().getName());
			return "Status : Failed" + "Thread Name : ==> " +  Thread.currentThread().getName();
		}
		}
		System.out.println("Building is DONE!!! ...by "+ Thread.currentThread().getName());
		 return "Status : Successfull" + "Thread Name :==> " +  Thread.currentThread().getName();

	}

}
