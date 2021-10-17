package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {

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

		long streamCount = filetredStream.count();
		System.out.println(streamCount);

		System.out.println("now in one line");

		long newfiletredStream = arList.stream().filter(i -> i >= 20).count();
		System.out.println(newfiletredStream);

	}

}
