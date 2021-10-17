package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(52);
		arList.add(35);
		arList.add(5);

		// get stream object
		Stream<Integer> openStream = arList.stream();

		// configure stream by filtering out required values
		Stream<Integer> filetredStream = openStream.filter(i -> i >= 20);

		Object[] intArr = filetredStream.toArray();
		for(Object o : intArr) {
			System.out.println("element in array is " + o);
		}

		System.out.println("now in one line");

		Object[] intOneLineArr = arList.stream().filter(i -> i>=20).toArray();
		for(Object o : intOneLineArr ) {
			System.out.println("elemets in array is :" + o);
		}

	}

}
