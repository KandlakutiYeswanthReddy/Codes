package Collection.LinkedList;

import java.util.*;

public class StackExample {
	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");
		
		for(String str : stack) {
			System.out.print(str +" ");
		}
		
		System.out.println();
		stack.pop();
		
		for(String str : stack) {
			System.out.print(str +" ");
		}
	}
}
