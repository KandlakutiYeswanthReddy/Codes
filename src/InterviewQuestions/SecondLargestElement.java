package InterviewQuestions;

import java.util.Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {

		
		// using if else
//		int a = 2, b = 1, c = 3;
//
//		if ((a > b && a < c) || (a < b && a > c)) {
//			System.out.println("a is second largest");
//
//		} else if ((b > a && b < c) || (b < a && b > c)) {
//			System.out.println("b is second largest");
//		} else {
//			System.out.println("c is second largest");
//		}
//
		
		int arr[] = {10,22,11};
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
		
	}
}
