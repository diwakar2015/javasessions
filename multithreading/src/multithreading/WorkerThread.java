package multithreading;

class WorkerThread implements Runnable {  

	
	public void run() {  
		
		System.out.println("Running Worker...."+ Thread.currentThread().getName());
		
		new MobileManufacture().manufacture();
		
		System.out.println("Work completed...will pick up another task...."+ Thread.currentThread().getName());//prints thread name  
	}  
	
} 