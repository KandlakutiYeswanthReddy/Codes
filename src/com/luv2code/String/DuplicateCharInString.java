package com.luv2code.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicateCharInString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}

		// System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(
						"The  repeated char is " + entry.getKey() + " repeated " + entry.getValue() + " times");

			}

		}

	}
}
