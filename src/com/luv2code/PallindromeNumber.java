package com.luv2code;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String [] args) {
		int rev,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n= sc.nextInt();
		
		int t=n;
		while(n!=0) {
		rev=n%10;
		n=n/10;
		sum = sum * 10 + rev;
		}
		if(t == sum)
		
			System.out.println("pallindrome");
		
		else 
			System.out.println("not pallindrome");
		
	}
}
