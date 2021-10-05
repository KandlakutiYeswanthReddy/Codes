package com.luv2code.Inheritance;

public class MultiLevelInheritance {
	
	public static void main(String[] args) {

		AddSubMul obj = new AddSubMul();
		
		obj.num1=5;
		obj.num2=6;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.mul();
		System.out.println(obj.result);
	}
}

	class Add1
	{
		int num1,num2,result=0;
		
		public void sum()
		{
			result = num1+ num2;
		}
	}
	
	class AddSub1 extends Add1     // Single level inheritance
	{
		public void sub() {
			result = num1 - num2;
		}
	}
	
	class AddSubMul extends AddSub1     // Multi-level inheritance
	{
		public void mul() {
			result = num1 * num2;
		}
	}

