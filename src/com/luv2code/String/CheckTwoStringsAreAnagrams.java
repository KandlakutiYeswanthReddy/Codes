package com.luv2code.String;

import java.util.Arrays;

public class CheckTwoStringsAreAnagrams {

	public static void main(String[] args) {
		
//		System.out.println(isAnagaram("abc", "bac"));
//
//	}

//	private static boolean isAnagaram(String string1, String string2) {
//		int count[] = new int[256];
//		for(int i =0;i<string1.length();i++) {
//			count[string1.charAt(i)]++;
//			count[string2.charAt(i)]--;
//		}
//		for(int i =0; i<count.length;i++) {
//			if(count[i] !=0 ) {
//				return false;
//			}
//		}
//		return true;
//	}
	
		String str1= "acd";
		String str2 = "adc";
		
		
		char [] arr1 = str1.toLowerCase().toCharArray();
		System.out.println(arr1);
		char [] arr2 = str2.toLowerCase().toCharArray();
		System.out.println(arr2);
		
		Arrays.sort(arr1);
		System.out.println(arr1);
		Arrays.sort(arr2);
		System.out.println(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagarm");
		}else {
			System.out.println("not anagaram");
		}
	}

}
