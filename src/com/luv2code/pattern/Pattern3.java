package com.luv2code.pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Input

		System.out.println("Enter the number of rows: ");

		int rows = sc.nextInt();

		for (int i = 1; i <= rows ; i++) { // For Loop for Row

			for (int j = 1; j <= i; j++) { // For Loop for Col

				System.out.print("*" + " "); // prints * and blank space

			}

			System.out.println(""); // new line

		}

		for (int i = rows-1 ; i >= 0; i--) { // For Loop for Row

			for (int j = 0; j < i; j++) { // For Loop for Col

				System.out.print("*" + " "); // prints * and blank space

			}

			System.out.println("");// new line

		}

		sc.close();

	}

}
