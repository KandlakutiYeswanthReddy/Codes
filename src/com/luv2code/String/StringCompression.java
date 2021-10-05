package com.luv2code.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != null) {

				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
	}

}
