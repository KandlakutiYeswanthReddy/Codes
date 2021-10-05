package com.luv2code.learnWithKrishna;

public class StackWithArray {

	int array[] = new int[5];
	int top = 0;

	private boolean push(int x) {
		top++;
		array[top] = x;
		System.out.println("the element added into stack :" + x);
		return true;
	}

	private int pop() {
		int x = array[top--];
		System.out.println("the element popped from stack :" + x);
		return x;
	}

	private int peek() {
		return array[top];
	}

	public static void main(String[] args) {

		StackWithArray stack = new StackWithArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.pop();
		System.out.println("printing the top most element of stack :" + stack.peek());

	}
}
