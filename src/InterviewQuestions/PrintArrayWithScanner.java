package InterviewQuestions;

import java.util.Scanner;

public class PrintArrayWithScanner {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter elements of array :");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {

			System.out.println(arr[i]);
		}
	}
}
