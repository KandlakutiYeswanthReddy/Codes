
package com.luv2code.String;

import java.util.Scanner;

public class ExtractFirstCharFromEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.nextLine();

		String words[] = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			System.out.print(s.charAt(0) + " ");		
		}

	}
}