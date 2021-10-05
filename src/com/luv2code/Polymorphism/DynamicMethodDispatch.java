package com.luv2code.Polymorphism;

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		AA obj1 = new AA();
		BB obj2 = new BB();

		AA ref; // reference created for a class

		ref = obj1; // object of a class is given to ref
		// ref=obj2; //object of b class is given to ref

		ref.show(); // if we give obj1 it will call AA classes method and if we give obj2 i will
					// call BB classes mehod
					// we are deciding which method to run at runtime this is called dynamic method dispatch
					// runtime polymorphismh

	}

}

class AA {
	
	public void show() {
		System.out.println("in AA class");
	}
}

class BB extends AA {
	public void show() {
		System.out.println("in BB class");
	}
}
