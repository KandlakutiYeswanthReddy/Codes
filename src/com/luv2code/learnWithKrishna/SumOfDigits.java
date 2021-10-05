package com.luv2code.learnWithKrishna;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num=12345, sum=0;
		
		while(num>0) {
			
			int ln = num%10;
			sum = sum +ln;
			num= num/10;
			
		}
		System.out.println("sum of digits in number :"+sum);
		
	}

}
