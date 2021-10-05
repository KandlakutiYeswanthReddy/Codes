package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefDemo {

	public static void main(String[] args) {
		
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.forEach(MethodRefDemo::doubleit);

	}
	
	public static void doubleit(int i) {
		
		System.out.println(i*2);
	}

}
