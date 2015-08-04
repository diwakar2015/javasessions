package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MobileFactory {  

	public static void main(String[] args) { 
		
		// Creates a thread poll of size 5 workers thread
		ExecutorService executorPool = Executors.newFixedThreadPool(5);//creating a pool of 5 threads 
		
		
		// I need to manufacture 30 units of mobile.
		
		for (int i = 1; i<=30; i++) {  
			
			// This is creation of thread object
			Runnable worker = new WorkerThread();  
			
			//Submitting it to the pool
			executorPool.execute(worker);
			
		}  

		
		
		System.out.println("Total number of thread : "+ Thread.activeCount());
		
	}  
}  