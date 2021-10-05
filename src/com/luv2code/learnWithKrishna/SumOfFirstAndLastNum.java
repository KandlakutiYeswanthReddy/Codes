package com.luv2code.learnWithKrishna;

import java.util.Scanner;

public class SumOfFirstAndLastNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();

		int lastDigit = number % 10;

		int firstDigit = number;

		while (firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}

		System.out.println("firstDigit :" + firstDigit);
		System.out.println("lastdigit : " + lastDigit);
		System.out.println("Sum of first and last digit :" + (firstDigit + lastDigit));
	}

}
