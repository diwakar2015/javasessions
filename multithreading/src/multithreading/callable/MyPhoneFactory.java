package multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyPhoneFactory {
	
	public static void main(String[] args) {

		ExecutorService executorPool = Executors.newFixedThreadPool(4);

		for(int i=1; i<=20000; i++)
		{
			Callable<String> worker = new PhoneWorker();
		
			Future<String> future = executorPool.submit(worker);
			
			// wait here till this thread finishes and ends up with fail or successful
			
			boolean listen = true;
			
			while(listen)
			{
				
				if(future.isDone())
				{
					String resultStaus;
					
					try
					{
						resultStaus = future.get();
						listen = false;
						System.out.println("Task execution status is : "+ resultStaus);
						
					}
					catch(Exception e)
					{
						System.out.println("Exception caught "+ e);
					}
					
					
				}
				
				
			}
			
			

		}

	}




}
