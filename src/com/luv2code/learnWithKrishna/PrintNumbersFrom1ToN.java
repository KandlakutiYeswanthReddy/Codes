package com.luv2code.learnWithKrishna;

import java.util.Scanner;

public class PrintNumbersFrom1ToN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		

		for(int i=1; i<=num;i++) {
			System.out.println(i);
		}
	}

}
