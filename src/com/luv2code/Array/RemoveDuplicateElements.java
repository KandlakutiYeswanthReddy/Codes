package com.luv2code.Array;

import java.util.*;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");
		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		// Print the elements of LinkedHashSet
		System.out.print(set);
	}
}
