package com.luv2code.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EachCharOccu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine().trim();

		// method -1

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		 System.out.println(map);

//		Map<Character, Integer> map = new HashMap();
//		char[] chars = input.toCharArray();
//
//		for (char ch : chars) {
//			if (!map.containsKey(ch) ) {
//				map.put(ch, 1);
//			} else {
//				int value = map.get(ch);
//				map.put(ch, value + 1);
//			}
//		}
//		System.out.println(map);

		// method -2

//		Map<Character, Integer> map = new HashMap();
//		for(int i =0; i<input.length(); i++) {
//			char ch = input.charAt(i);
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
//		}
//		
//		System.out.println(map);

	}

}
