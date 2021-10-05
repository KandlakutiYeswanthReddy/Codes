package com.luv2code.Singleton;

public class SignletonWithEnum {

	public static void main(String[] args) {
		
		ABCEnum obj1 = ABCEnum.INSTANCE;
		obj1.i = 5;
		obj1.show();
		
		ABCEnum obj2 = ABCEnum.INSTANCE;
		obj2.i=6;
		obj2.show();
		

	}

}

enum ABCEnum	
{
	INSTANCE;
	
	int i;
	public void show() {
		System.out.println(i);
	}
}
