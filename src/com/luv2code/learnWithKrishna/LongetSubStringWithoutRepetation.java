package com.luv2code.learnWithKrishna;

import java.util.HashSet;

public class LongetSubStringWithoutRepetation {
	public static void main(String[] args) {

		String str = "abcdab";
		longest(str);
	}
	private static String longest(String str) {

		HashSet<Character> set = new HashSet<>();
		String LongestTillNow = "";
		String LonestOverAll = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				LongestTillNow = "";
				set.clear();
			}
			
			set.add(ch);
			LongestTillNow += ch;

			if (LongestTillNow.length() > LonestOverAll.length()) {
				LonestOverAll = LongestTillNow;
			}
		}
		return LonestOverAll;
	}
}
