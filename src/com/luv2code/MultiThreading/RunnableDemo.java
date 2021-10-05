package com.luv2code.MultiThreading;

public class RunnableDemo {

	public static void main(String[] args) {
		
		Abc obj = new Abc();
		obj.start();
		
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 1; i < 5; i++) {
					System.out.println("Hello");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

				}
			}

		};
		Thread t = new Thread(r);
		t.start();

	}
	}
				class Abc extends Thread
				{
					public void show()
					{
					for(int i=1;i<5;i++) {
						System.out.println("Hi");
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						
					}
					}
					
					public void run() {
						show();
					}
				}
				


