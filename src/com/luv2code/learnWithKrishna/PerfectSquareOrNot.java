package com.luv2code.learnWithKrishna;

//import java.util.Scanner;
//
//public class PerfectSquareOrNot {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number");
//		
//		int number = sc.nextInt();
//		
//		for(int i =1; i<number/2; i++) {
//			if( number == i*i) {
//				System.out.println("the square of :" + i);
//			}
//			
//		}
//		
//	}
//}


//----------------------------------------




import java.util.Scanner;  
public class PerfectSquareOrNot  
{  
public static void main(String[] args)   
{   
//object of the Scanner class  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");   
//reading a number of type double from the user  
double number=sc.nextDouble();   
if (checkPerfectSquare(number))   
System.out.println("Yes, the given number is perfect square.");  
else  
System.out.print("No, the given number is not perfect square.");   
}  
//user-defined method that checks the number is perfect square or not   
static boolean checkPerfectSquare(double number)   
{   
for (int i=1; i*i<=number; i++)   
{   
//if (i * i = number)   
//comparing conditions using logical AND  
if((number%i==0) && (number/i==i))   
{   
//returns true if both conditions are true      
return true;   
}   
}   
//returns false if any one condition is false  
return false;   
}   
}  