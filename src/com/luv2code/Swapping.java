package com.luv2code;

public class Swapping {

	public static void main(String[] args) {
		
		int a=5, b=4;
		
		//1 st model		
//		int temp = a;
//		a = b;
//		b = temp;
		
		// 2 nd model		
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		// 3 rd model XOR  1 1 -> 0 , 1 0 -> 1 , 0 1 -> 1 , 0 0 -> 0		
//		a= a^b;    // 1 0 1 ^ 1 0 0 -> 0 0 1 -> 1
//		b= a^b;    // 0 0 1 ^ 1 0 0 -> 1 0 1 -> 5
//		a= a^b;	   // 0 0 1 ^ 1 0 1 -> 1 0 0 -> 4
		
		
		// 4 th way		
		b= a+b- (a=b); // in java we will first solve the things in bracket and then arithmaic symbols		
						//here we are preserving the value of "b" by assigning it to a 
				
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		
		
	}
}
