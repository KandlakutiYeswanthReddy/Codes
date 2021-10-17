package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(25);
		arList.add(35);
		arList.add(5);

		List<Integer> newAl = new ArrayList<Integer>();

		newAl = arList.stream().filter(x -> x >= 15).collect(Collectors.toList());

		newAl.forEach(x -> System.out.println(x));

		// Without Stream

//		 List<Integer> arListFromMethod = findElements(arList);
//		for(Integer i :arListFromMethod) {
//		System.out.println(i);
//		}
//	}
//
//	private static List<Integer> findElements(List<Integer> arList) {
//		List<Integer> newAl = new ArrayList<Integer>();
//		
//		for(Integer i : arList) {
//			if(i >= 15) {
//				newAl.add(i);
//			}
//		}
//		
//		return newAl;
//	}

	}
}
