package com.luv2code.learnWithKrishna;

public class PrintEvenPositionElements {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		for(int i=2; i<arr.length;i=i+2) {
			System.out.print("Index ="+ i + " ");
			System.out.println("Values ="+ arr[i]);
		}

	}

}
