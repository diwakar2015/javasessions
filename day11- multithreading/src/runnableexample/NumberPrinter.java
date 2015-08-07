/**
 * 
 */
package runnableexample;

/**
 *  @author Diwakar
 *
 * Date:  Aug 7, 2015 2015
 * File: ThreadExample.java
 */
public class NumberPrinter extends DisplayHelper implements Runnable {

	@Override
	public void run(){
		
		for(int i=1; i<=10; i++)
		{
			display(i, Thread.currentThread().getName());
			if(i==10)
				System.out.println("I am done===="+ Thread.currentThread().getName());
		}

	}
	

}


class DisplayHelper
{
	public void display(int num, String threadName)
	{
		System.out.println("Printing : "+ num+  "  By Thread : "+ threadName);
	}
	
}
