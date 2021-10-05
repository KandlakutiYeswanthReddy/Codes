package com.luv2code.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of size of array");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");
		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		// For print the array element
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : a) {
			map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
		}

		// System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(
						"The  repeated number is " + entry.getKey() + " repeated " + entry.getValue() + " times");

			}
		}

	}

}
