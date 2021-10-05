package Java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {

		PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
		System.out.println(predicateFunctionDemo.testString("code decode"));

		// using predicate

		Predicate<String> checkLength = s -> s.length() >= 5;
		System.out.println("the length of string is greater than 5 :" + checkLength.test("code decode"));

		// function use
		
		Function<Integer , Integer> squreMe = i -> i*i;
		System.out.println("squre of number is : " + squreMe.apply(5));
	}

	public boolean testString(String s) {
		if (s.length() >= 5) {
			return true;
		} else {
			return false;
		}
	}
}
