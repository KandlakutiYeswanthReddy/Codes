package Java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		ConsumerDemo consumerDemo = new ConsumerDemo();
		consumerDemo.squareIt(7);
		
		
		
		Consumer<Integer> squareMe = i -> System.out.println("Takes the input and perform operation and return nothing :" + i * i);
		squareMe.accept(7);
		
	}

	private void squareIt(int i) {
		int squared = i* i;
		System.out.println("squared number is : " + squared);
		
	}
	

}
