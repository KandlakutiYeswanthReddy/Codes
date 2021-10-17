package Java8;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class Consumerdemo2 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
//		Consumer<Integer> c = new Consumer<>()
//		{	
//			public void accept(Integer i) {
//				System.out.print(i + " ");
//			}
//		};
		
		Consumer<Integer> c = i -> System.out.print(i + " ");
		
		//values.stream().forEach(i -> System.out.print(i+ " "));
		
		
		values.forEach(c);
	}

}
