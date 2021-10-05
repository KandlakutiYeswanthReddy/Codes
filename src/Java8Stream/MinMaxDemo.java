package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(52);
		arList.add(35);
		arList.add(5);
		
		//get stream object
		Stream<Integer> openStream = arList.stream();
		
		//configure stream by filteringout required values
		Stream <Integer> filetredStream = openStream.filter(i -> i >=20);
		
//		Integer min  = filetredStream.min((i1,i2) -> i1.compareTo(i2)).get();
//		System.out.println(min);
	
//		Integer max  = filetredStream.max((i1,i2) -> i1.compareTo(i2)).get();
//		System.out.println(max);
	
		System.out.println("now in one line");
		
		Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);

		Integer maxValue = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxValue);


	}

}
