package com.threading.producerconsumer;

import java.util.Vector;

public class Consumer implements Runnable{

	private final Vector<Integer> sharedData;
	private final int SIZE;

	Consumer(Vector<Integer> sharedData, int SIZE)
	{
		this.sharedData = sharedData;
		this.SIZE = SIZE;

	}

	@Override
	public void run() {

		while(true)
		{
			try {
				System.out.println("Consumed : "+consume());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}

	public int consume() throws InterruptedException
	{
		while(sharedData.isEmpty())
		{
			synchronized (sharedData) {

				System.out.println("Queue is empty.....so waiting" + Thread.currentThread().getName());
				sharedData.wait(); //wait for someone to notify/notifyall that element got added in the queue.
			}

		}

		synchronized (sharedData) {
			sharedData.notifyAll();
			return (Integer)sharedData.remove(0);

		}	
	}


}



