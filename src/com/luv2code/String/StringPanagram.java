package com.luv2code.String;

import java.util.Scanner;

public class StringPanagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter String");
		String str = sc.nextLine();

		boolean b;
		if(b=isPanagram(str.toLowerCase())) {
			System.out.println("is pangram");
		}else {
			System.out.println("is not pangram");
		}
	}

	public static boolean isPanagram(String str) {
		if (str.length() < 26) {
			return false;
		} else if (str.length() > 26) {
			for (char c = 'a'; c <= 'z'; c++) {
				if (str.indexOf(c) < 0) {
					return false;
				}
			}

		}
		return true;

	}

}
