package com.luv2code.InnerClass;

public class InnerclassWithLambdaExpression {

	public static void main(String[] args) {

		BBB obj = () ->	System.out.println("Hi Innerclass with lambda expression");
		
		obj.show();
	}

}

interface BBB {

	void show(); // by default all methods in interface are public abstract
}
