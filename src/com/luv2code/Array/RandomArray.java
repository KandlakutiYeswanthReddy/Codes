package com.luv2code.Array;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {

		Random r = new Random();
		int a[] = new int[20];

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(50); // till 50
		}

		try {
			System.out.println(a[52]); // this means start with this
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Maximum index value is 49");

		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
