package Java8;

import java.util.function.Function;

public class FunctionalChainingDemo {

	public static void main(String[] args) {
		
		Function<Integer , Integer> doubleIt = i -> 2*i;
		System.out.println("Double of number is : " + doubleIt.apply(2));
		
		Function<Integer , Integer> cubeIt = i -> i*i*i;
		System.out.println("Cube of number is : " + cubeIt.apply(2));
		
		System.out.println("First doubleing using apply : " + doubleIt.andThen(cubeIt).apply(2));

		System.out.println("First cubling using compose : " + doubleIt.compose(cubeIt).apply(2));
	}

}
