package com.luv2code.Singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		Abc obj = Abc.getInstance();
		Abc obj1 = Abc.getInstance();
	}
}

class Abc {

	public static Abc obj;

	private Abc() {
		System.out.println("instance created");
	}

	public static Abc getInstance() {

		if (obj == null) {
			obj = new Abc();
		}
		return obj;
	}
}
