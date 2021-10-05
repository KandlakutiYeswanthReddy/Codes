package com.luv2code.String;

import java.util.Arrays;

public class CharOccurPrint {

	public static void main(String[] args) {

		String input = "opentext";
		char charToReplace = 'e';

		if (input.indexOf(charToReplace) == -1) {
			System.out.println("given char is not in string");
			System.exit(0);

		}

		// model-2

		int ct = 1;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == charToReplace) {

				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(ct));
				ct++;
			}
		}

		System.out.println(input);

		// model -1 works till 10 char

		char[] arr = input.toCharArray();
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == charToReplace) {
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}