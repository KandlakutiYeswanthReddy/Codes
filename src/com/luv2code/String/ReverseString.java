package com.luv2code.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String str = "hello";

		// Approch-1

//		char[] charArr = str.toCharArray();
//		for (int i = charArr.length - 1; i >= 0; i--) {
//			System.out.print(charArr[i]);
//		}
//
//		System.out.println("");

		// Approch -2
		
//		String reverse = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String");
//
//		String original = sc.nextLine();
//
//
//		for (int i = original.length()-1; i >= 0; i--) {
//			System.out.print(original.charAt(i));
//		}
//
//		System.out.println("");

		// Approch -3

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		

		// Approch -4

//		StringBuilder sbuilder = new StringBuilder(str);
//		System.out.println(sbuilder.reverse());

	}

}
