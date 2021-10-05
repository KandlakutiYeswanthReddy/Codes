package com.luv2code.String;

import java.util.Scanner;

public class CharOccuranceInString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String str = sc.nextLine().toLowerCase();

		System.out.println("Enter Character :");
		char c = sc.nextLine().charAt(0);
		int ocurrence = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				ocurrence++;
		}

		System.out.println("Number of occurrenced of Char " + c + " is " + ocurrence);

	}
}
