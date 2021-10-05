package com.luv2code.String;

public class SwappingOfTwoStrings {

	public static void main(String args[]) {
		String a = "HI";
		String b = "Man";
		System.out.println("Before swap: " + a + " " + b);
		a = a + b;

		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
	}

}
