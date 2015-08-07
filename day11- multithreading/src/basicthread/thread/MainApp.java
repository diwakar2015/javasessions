/**
 * 
 */
package basicthread.thread;

/**
 *  @author Diwakar
 *
 * Date:  Aug 7, 2015 2015
 * File: MainApp.java
 */
public class MainApp {
	public static void main(String[] args) {



		Thread t1 = new NumberPrinter();

		t1.setName("Thread-1");

		// This is getting pushed to TS
		t1.start();


		Thread t2 = new NumberPrinter();

		t2.setName("Thread-2");
		t2.start();

		Thread t3 = new NumberPrinter();

		t3.setName("Thread-3");
		t3.start();


		Thread t4 = new NumberPrinter();

		t4.setName("Thread-4");
		t4.start();

	}


}
