package com.luv2code.String;
// Java program to print all substrings of a string
public class PrintAllSubStrings {

	
	public static void main(String[] args) {
		
		String str = "abd";
		int n = str.length();
		for (int i = 0; i < n; i++)
			for (int j = i+1; j <=n; j++)
		
	   System.out.println(str.substring(i, j));
		
//		for (int i = 0; i < n; i++)
//		
//	   System.out.println(str.substring(0, i+1));
		
	}
	
}
