package com.luv2code.Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show(5.5);
	}

}

class A {

	public void show() {
		System.out.println("Hello ");
	}

	public void show(int i) {
		System.out.println("Hello :" + i);
	}
	public void show(double d) {
		System.out.println("Hello :" + d);
	}
}