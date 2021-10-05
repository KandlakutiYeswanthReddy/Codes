package com.luv2code.Polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {

		Base obj = new Child();
		// Child obj = new Child();
		obj.show();

	}

}

class Base {
	public Base() {
		System.out.println("in Base");
	}

	public void show() {
		System.out.println("in A class");
	}
}

class Child extends Base {

	public Child() {

		System.out.println("in child");
	}

	public void show() {
		System.out.println("in B class");
	}
}