package com.luv2code.InnerClass;



public class MemberInnerclass {

	public static void main(String[] args) {
		
		A a = new A();
		A.B obj = a.new B();   //a is instance of A class
		obj.show();

	}

}

class A{
	int rollno;
	String name;
	
	 class B{
		
	public void show() {
		System.out.println("Hello");
	}
		
	}
}
