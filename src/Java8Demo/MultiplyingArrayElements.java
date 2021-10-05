package Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyingArrayElements {

	public static void main(String[] args) {
		Integer[] inputArray = {1,2,3,4,5};
		
		List<Integer> numberList = Arrays.asList(inputArray);
		
		Optional<Integer> output = numberList.stream().reduce((a,b)->a*b);
		
		if(output.isPresent()) {
			System.out.println("Array multiplication using Java 8 : " + output.get());
		}else {
			System.out.println("Empty Array/List");
		}
		
		
		if(numberList.size()>0) {
		Integer foreachoutput = 1;
		for(Integer num : numberList) {
			foreachoutput*=num;
		}
		System.out.println("Array multiplication without using Java 8 : " + foreachoutput);
		}else {
			System.out.println("Empty Array/List");
		}
		
	}
}
