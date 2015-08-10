package com.threading.producerconsumer;

import java.util.Vector;

public class ProducerConsumer {

	
	public static void main(String[] args) {
		
		Vector<Integer> sharedData = new Vector<Integer>();
		int SIZE=5;
		
		Producer prod = new Producer(sharedData, SIZE);
		
		Thread prodThread  = new Thread(prod);
		prodThread.setName("Producer-Thread");
		prodThread.start();
		
		System.out.println("Starting Consumer now");
		
		Consumer con = new Consumer(sharedData, SIZE);
		
		Thread conThread  = new Thread(con);
		conThread.setName("Consumer-Thread");
		conThread.start();
		
		
		
		System.out.println("Done!!");

	}

}
