package com.luv2code.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {

		int a[] = new int[4];
		int i, j = 1, k = 0;

		i = 8;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter a number :");
			j = Integer.parseInt(br.readLine());

			k = i / j;

			System.out.println("Output is :" + k);

//			for (int c=0; c<=4;c++)
//			{
//				a[c]= c+1; 
//			}
//			for(int value : a)
//			{
//				System.out.println(value);
//			}
		}

		catch (IOException e) {
			System.out.println("some IO exception");
		} catch (ArithmeticException e) {

			System.out.println("cannot didvide by zero " + e);
		}

//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			
//			System.out.println("Maximum number is 4");
//		}
		catch (Exception e) {
			System.out.println("unknown exception");
		} finally {
			System.out.println("Finally block");
		}

	}

}
