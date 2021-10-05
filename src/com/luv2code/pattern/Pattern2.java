package com.luv2code.pattern;



public class Pattern2 {

	public static void main(String[] args) {
		
		int num=5;
		
		 for(int i = num; i >= 1; i--) {  //For Loop for Row 

	            for(int j = 1; j <= i; j++)  //For Loop for Col
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
