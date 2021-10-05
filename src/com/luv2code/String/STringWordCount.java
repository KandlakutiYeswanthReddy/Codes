package com.luv2code.String;

public class STringWordCount {

public static void main(String[] args) 
{
//String whose character count to be determined  
String str="humpty dumpty hitched"; 

//split the string using space and save in temp array
String temp[]=str.split(" ");

//Run the for loop to print the character count for word
for(int i=0; i<=temp.length-1;i++)
{
 System.out.println(temp[i]+" --> "+temp[i].length());
}
  
}
}
