package com.luv2code.String;

public class PrintEvenLengthWords {

	public static void main(String[] args) {

		String str = " hello world is this ok";

		for (String s : str.split(" ")) {
			if (s.length() % 2 == 0) {
				System.out.println(s);
			}
		}

	}

}
