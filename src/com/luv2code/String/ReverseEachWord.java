package com.luv2code.String;

public class ReverseEachWord {

	public static void main(String[] args) {

		String input = "I am not coding ";
		System.out.println("original string ::" + input);

		String output = "";

		String[] words = input.split(" ");

		for (String word : words) {
			String revWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			output = output + revWord + " ";
		}

		System.out.println("Reversed String ::" + output);
	}
}
