package multithreading.callable;

import java.util.concurrent.Callable;

public class PhoneWorker implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		String status = new PhoneManufacture().buildMobile();
		
		return status;
	}
	
	

}
