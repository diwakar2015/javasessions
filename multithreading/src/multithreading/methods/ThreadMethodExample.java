package multithreading.methods;


public class ThreadMethodExample {

	public static void main(String[] args) throws InterruptedException {

System.out.println("I am going to create 10 thread.."+ Thread.currentThread().getName());
		
	Thread t1 = new Thread(new Worker());
	t1.start();
	t1.join();
	
	Thread t2 = new Thread(new Worker());
	t2.start();
	t2.join();

		// Do not go further till all 10 thread finishes...
		System.out.println("Counter ====> "+ Worker.counter+ " by "+ Thread.currentThread().getName());


	}

}

class Worker implements Runnable
{

	public static int counter=0;

	@Override
	public void run() {
		for(int i=1; i<=10; i++)
		{
			counter++;
			System.out.println("Value :"+ i +" by Thread "+ Thread.currentThread().getName());
		}

	}

}


