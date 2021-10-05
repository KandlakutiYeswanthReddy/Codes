package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {

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
		
		Stream <Integer> sortedStream = filetredStream.sorted();
		sortedStream.forEach(x -> System.out.println(x));
		
		
		System.out.println("now in one line");

		
		Stream <Integer> filetredSortedList  = arList.stream().sorted();
		filetredSortedList.forEach(x -> System.out.println(x));

	}

}
