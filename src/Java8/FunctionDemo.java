package Java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		FunctionDemo functionDemo = new FunctionDemo();
		System.out.println(functionDemo.squareInt(5));
		
		Function<Integer , Integer> squreMe = i -> i*i;
		System.out.println("squre of number is : " + squreMe.apply(5));

	}

	private int squareInt(int i) {
		
		int squred = i * i;
		return squred;
	}

}
