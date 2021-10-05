package com.luv2code.learnWithKrishna;
import java.util.Scanner;
public class InsertElementinArrayAtSpecicificLoc {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		System.out.println("enter elemets");
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length-1;i++) {
			arr[i] = sc.nextInt();
				}
		System.out.println("print elements before transform");
		for(int i : arr) {
			System.out.println(i);
		}	
		System.out.println("enter at which loc we need to add");
		int loc = sc.nextInt();
		
		System.out.println("enter what value we need to add");
		int value = sc.nextInt();
		
		for(int i=arr.length-1;i>loc;i--) {
			arr[i] = arr[i-1];
		}
		arr[loc]= value;
		
		for(int i :arr) {
			System.out.println(i);
		}
	}
}
