package com.luv2code.Inheritance;

public class ObjectCreationInInheritance {

	public static void main(String[] args) {
		
		 A obj = new B(); // it calls non-para constructor of b class and default cons of Super class
		
		 //A obj = new B(5);  /* reference of base class and object of sub class
		 					//	the parameterized constructor of B class  calls the B(int j) constroctor 
		 						//and it only calls the A() Default constructor of Base class
		 							 				
		  						//*/
		 
		
	}
}
	class A
	{
		public A() {
			System.out.println("in cost A");
		}
	
	
	public  A(int i) {
			System.out.println("in cost A int");
		}
	}
	
	class B extends A
	{
		public  B() {
			System.out.println("in cost B");
		}
	
		public  B(int j) {
			System.out.println("in cost B int");
		}
	
}
