package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(52);
		arList.add(35);
		arList.add(5);

		// get stream object
		Stream<Integer> openStream = arList.stream();

		// configure stream by filtering out required values
		Stream<Integer> filetredStream = openStream.filter(i -> i >= 20);

		List<Integer> newFilteredStream = filetredStream.collect(Collectors.toList());
		newFilteredStream.stream().forEach(x -> System.out.println(x));

		System.out.println("now in one line");

		// what we have to do
		// .1)Open stream with .stream()
		// 2) use lambda expression in filter to filter the required objects from the stream
		// 3)collect all filtered elements and add them to a List called newFileterfList

		List<Integer> newfiletredStream = arList.stream().filter(i ->i >= 20).collect(Collectors.toList());
		newfiletredStream.forEach(x -> System.out.println(x));

	}

}
