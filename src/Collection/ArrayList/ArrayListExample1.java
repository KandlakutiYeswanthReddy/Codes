package Collection.ArrayList;

import java.util.*;

public class ArrayListExample1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list);

		System.out.println("\nIterating ArrayList using Iterator:");
		Iterator itr = list.iterator();// getting the Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());
		}

		// Traversing list through for-each loop
		System.out.println("\nIterating ArrayList using For-each loop:");
		for (String fruit : list)
			System.out.println(fruit);
	}
}