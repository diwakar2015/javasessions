package multithreading;

public class MobileManufacture {
	
	public void manufacture()
	{
		System.out.println("Manufacturing the mobile....by "+ Thread.currentThread().getName());
        try {
			Thread.sleep(1000);
			if(Thread.currentThread().getName().equalsIgnoreCase("pool-1-thread-1"))
				
			throw new NullPointerException();
			
		} catch (Exception e) {
			System.out.println("Exception caught for thread "+ Thread.currentThread().getName());
			
		}	
	
	System.out.println("Manufactued the mobile..done!!...by "+ Thread.currentThread().getName());
	
	}

}
