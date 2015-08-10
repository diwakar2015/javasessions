package com.threading.producerconsumer;

import java.util.Vector;

public class Producer implements Runnable{

	private final Vector<Integer> sharedData;
	
	private final int SIZE;

	Producer(Vector<Integer> sharedData, int SIZE)
	{
		this.sharedData = sharedData;
		this.SIZE = SIZE;

	}

	@Override
	public void run() {


		for(int i=1; i<=100; i++)
		{
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public void produce(int value) throws InterruptedException
	{
		if(sharedData.size()==SIZE)
		{
			synchronized (sharedData) {
				System.out.println("Queue is full so waiting.... : "+ Thread.currentThread().getName());
				try {
					sharedData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			
		}
		
		synchronized (sharedData) {
			Thread.sleep(1000);
			
			sharedData.add(value);
			System.out.println("Produced : "+value);
			sharedData.notifyAll();// waking up those thraeds who are waiting on the queue 
			
		}
		
	}


}
