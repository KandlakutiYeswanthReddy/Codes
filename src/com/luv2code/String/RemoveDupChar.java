package com.luv2code.String;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDupChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");
		String str = sc.nextLine();

		// Approch-1

		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char) c)); // using distinct method in java 8
		System.out.println(sb1);

		// Approch -2

//		StringBuilder sb2 = new StringBuilder();
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			int idx = str.indexOf(ch, i + 1); // using indexof- which gives the first occurance of the char in given
//												// string
//			if (idx == -1) {
//				sb2.append(ch);
//			}
//		}
//		System.out.println(sb2);

		// Approch -3

//		char[] arr = str.toCharArray();
//		StringBuilder sb3 = new StringBuilder();
//		for (int i = 0; i < arr.length; i++) {
//			boolean repeated = false;
//
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					repeated = true;
//					break;
//				}
//			}
//
//			if (!repeated) {
//				sb3.append(arr[i]);
//			}
//		}
//
//		System.out.println(sb3);

		// Approch -4

//		StringBuilder sb4 = new StringBuilder();
//		Set<Character> set = new LinkedHashSet();
//		for(int i=0;i<str.length();i++) {
//			set.add(str.charAt(i));
//		}
//		for(Character c : set) {
//			sb4.append(c);
//		}
//		System.out.println(sb4);
//		
		
		
		

	}

}
