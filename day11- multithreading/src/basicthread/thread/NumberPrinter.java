/**
 * 
 */
package basicthread.thread;

/**
 *  @author Diwakar
 *
 * Date:  Aug 7, 2015 2015
 * File: ThreadExample.java
 */
public class NumberPrinter extends Thread{

	@Override
	public void run(){
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Printing "+ i + " By thread : "+ Thread.currentThread().getName());
			if(i==10)
				System.out.println("I am done===="+ Thread.currentThread().getName());
		}

	}


}
