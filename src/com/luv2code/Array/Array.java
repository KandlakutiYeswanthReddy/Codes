package com.luv2code.Array;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5];

		// 1 st
//		a[0]=2;
//		a[1]=1;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
//		
//		for(int i=0;i<5;i++)
//			System.out.println(a[i]);

		// 2nd without manually assigning values
//			for(int i=0;i<a.length;i++)
//			{
//				a[i] = i+1;
//			}
//			for(int i=0;i<a.length;i++)
//				System.out.println(a[i]);	
//	

		// 3 rd Enhanced for loop
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}

		for (int i : a) {
			System.out.println(i);
		}
	}

}
