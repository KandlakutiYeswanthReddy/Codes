package com.luv2code.String;

public class RemoveSpecialChar {

	public static void main(String[] args) {
	
		
		String str = "$J@#avastar&*$";
		
		//replaceAll() method
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}

}
