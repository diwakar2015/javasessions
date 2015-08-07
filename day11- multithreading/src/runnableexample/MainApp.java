/**
 * 
 */
package runnableexample;

/**
 *  @author Diwakar
 *
 * Date:  Aug 7, 2015 2015
 * File: MainApp.java
 */
public class MainApp {
	public static void main(String[] args) {



		NumberPrinter num = new NumberPrinter();
		Thread t1 = new Thread(num);
		t1.setName("Thread-1");
		// This is getting pushed to TS
		t1.start();

		num = new NumberPrinter();
		Thread t2 = new Thread(num);
		t2.setName("Thread-2");
		t2.start();

		num = new NumberPrinter();
		Thread t3 = new Thread(num);
		t3.setName("Thread-3");
		t3.start();


		num = new NumberPrinter();
		Thread t4 = new Thread(num);
		t4.setName("Thread-4");
		t4.start();

	}


}
