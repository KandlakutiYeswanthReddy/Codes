package com.luv2code;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer:");
		n = s.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("The number is Perfect");
		} else {
			System.out.println("The number is not Perfect");
		}
	}

}
