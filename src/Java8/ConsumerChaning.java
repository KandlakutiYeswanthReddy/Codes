package Java8;

import java.util.function.Consumer;

public class ConsumerChaning {

	public static void main(String[] args) {
		
		Consumer<Integer> squareMe = i -> System.out.println("Takes the input and square operation and return nothing :" + i * i);
		squareMe.accept(7);
		
		Consumer<Integer> doubleMe = i -> System.out.println("Takes the input and double operation and return nothing :" + 2 * i);
		doubleMe.accept(7);
		
		squareMe.andThen(doubleMe).accept(7);
		
		//squareMe.compose(doubleMe).accept(7);  //no compose method in consumer

	}

}
