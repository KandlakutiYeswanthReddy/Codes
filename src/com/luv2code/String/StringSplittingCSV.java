package com.luv2code.String;

public class StringSplittingCSV {

	public static void main(String[] args) {
		
		String str = " chandhu, gokul, santosh";
		
		String names[] = str.split(",");
		
		
		//if you want to print particularly
//		 System.out.println(names[2]);
		
		//if you want to print all values
		for(String val : names)
	{
		System.out.println(val);	
	}
	}
}
