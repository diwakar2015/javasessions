package multithreading;

public class RunnableExample {
	public static void main(String[] args) {
		
		Thread t =  new Worker();
		t.start();
		
		
		
		AnotherWorker worker1 = new AnotherWorker();
		worker1.display();
		
		Thread t1 = new Thread(worker1);
		
		t1.start();
		
		
	}
	

}


class Worker extends Thread 
{


	@Override
	public void run() {
		System.out.println("I am running...");
		
	}
	
}


class AnotherWorker extends ABC implements Runnable 
{

	
	
	@Override
	public void run() {
		System.out.println("I am running...");
		
	}
	
	
	
}


class ABC
{
	void display()
	{
		System.out.println("Display...");
	}
}