package com.luv2code.Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {

		Add a = new AddSub();
		System.out.println(a.a);

//		AddSub obj = new AddSub();
//		
//		obj.num1=5;
//		obj.num2=6;
//		obj.sum();
//		System.out.println(obj.result);
//		obj.sub();
//		System.out.println(obj.result);

	}
}

class Add {

	int a = 100;

	// int num1,num2,result=0;

//		public void sum()
//		{
//			result = num1+ num2;
//		}
}

class AddSub extends Add // Single level inheritance
{
	int a = 200;

//		public void sub() {
//			result = num1 - num2;
//		}
}
