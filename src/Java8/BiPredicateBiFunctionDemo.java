package Java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		
		BiPredicate<Integer, Integer> checkSumOfTwo = (a,b) -> a+b >=5 ;
		
		System.out.println("sum of 2 nd 5 is greater than 5: " + checkSumOfTwo.test(2,5) );
		System.out.println("sum of 2 nd 1 is greater than 5: " + checkSumOfTwo.test(2,1) );
		
		BiFunction<Integer, Integer, Integer> multiplyBoth = (a,b) -> a*b;
		System.out.println("Multiplication of 5 and 10 is :" + multiplyBoth.apply(5, 10) );
	}

}
