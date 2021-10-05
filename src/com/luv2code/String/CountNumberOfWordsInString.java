package com.luv2code.String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountNumberOfWordsInString {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine().trim();
		
		//1st method  -- wont work with space
		
		List<String> lists = Arrays.asList(s.split(" "));
	 
		System.out.println(lists.size());
		
		// 2nd one 
		
//		int count =0;
//		
//		if(s.charAt(0)!= ' '){
//			count++;
//		}
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
//				count++;
//			}
//		}
//		
//		System.out.println("count :" + count);
		
		//USING METHOD
		
//		int count = CountNumberofWords(s);
//		System.out.println("no of word in string :" + count);
//    }

//	private static Integer CountNumberofWords(String s) {
//		int count = 0;
//
//		if (s.charAt(0) != ' ') {
//			count++;
//		}
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
//				count++;
//			}
//		}
//		return count;
//
//	}
	}
}
