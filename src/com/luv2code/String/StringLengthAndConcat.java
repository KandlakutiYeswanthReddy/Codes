package com.luv2code.String;

import java.util.Scanner;

public class StringLengthAndConcat {

	public static void main(String[] args) {

		String S1, S2, S3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr Two Strings :");

		S1 = sc.nextLine();
		S2 = sc.nextLine();

		// Concatenation 1st method

		S3 = S1 + S2;

		// Concatenation 2nd method
		S3 = S1.concat(S2);

		int L1 = S1.length();
		int L2 = S2.length();

		System.out.println("Concatinated String " + S3);
		System.out.println("Length of S1 " + L1);
		System.out.println("Length of S2 " + L2);

		S1 = S1.toUpperCase();

		System.out.println("String with upper case " + S1);

	}

}
