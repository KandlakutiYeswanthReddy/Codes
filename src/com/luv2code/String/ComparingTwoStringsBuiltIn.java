package com.luv2code.String;

public class ComparingTwoStringsBuiltIn {

	public static void main(String[] args) {
		
			String s1 = "Sachin"; 
			String s2 = "sachin";
			String s3 = new String("sachin");
			
			System.out.println(s1.equals(s2));//false  
			System.out.println(s1.equalsIgnoreCase(s2));//true 
			
			System.out.println(s1==s2);//true (because both refer to same instance)  
			System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
			
			 System.out.println(s1.compareTo(s2));//0  
			   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
			   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
	}

}
