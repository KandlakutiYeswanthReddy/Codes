package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class LamdaExp3 {

	public static void main(String[] args) {

		// using Lambda Expression

//		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
//		biConsumer.accept(2, 5);

		// Emp -2

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		values.forEach(i -> System.out.println(i));

		// normal way

		LamdaExp3 demo = new LamdaExp3();
		demo.add(2, 7);

	}

	public void add(Integer a, Integer b) {
		System.out.println(a + b);
	}

}
