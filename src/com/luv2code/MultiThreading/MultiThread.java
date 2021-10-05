package com.luv2code.MultiThreading;

public class MultiThread {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.start();
		B obj1 = new B();
		obj1.start();
	}

}

class A extends Thread
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

class B extends Thread
{
	public void show()
	{
	for(int i=1;i<5;i++) {
		System.out.println("Hello");
		
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