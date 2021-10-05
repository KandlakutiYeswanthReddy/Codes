package Collection;

import java.io.*;
import java.util.*;

class CollectionsClassExp {

	public static void main(String[] args) {

		// Creating an object of List<String>
		List<String> arrlist = new ArrayList<String>();

		// Adding elements to arrlist
		arrlist.add("geeks");
		arrlist.add("for");
		arrlist.add("geeks");

		System.out.println("Elements of arrlist before the operations:");
		System.out.println(arrlist);

		System.out.println("Elements of arrlist after the operations:");
		// Adding all the specified elements
		// to the specified collection
		Collections.addAll(arrlist, "web", "site");

		// Printing the arrlist after
		// performing addAll() method
		System.out.println(arrlist);

		// Sorting all the elements of the
		// specified collection according to
		// default sorting order
		Collections.sort(arrlist);

		// Printing the arrlist after
		// performing sort() method
		System.out.println(arrlist);

	}
}
