package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {

		List<Integer> c = new ArrayList();

		c.add(108);
		c.add(237);
		c.add(229);
		c.add(228);

		// c.add(1,9);
		Comparator<Integer> com = new CompImpl();

		Collections.sort(c, com); // ascendig order

		// Collections.reverse(c); //descending order

		c.forEach(System.out::println); // Stream Api.. it uses lamda expression

//				for(Object o : c) {
//					System.out.println(o);
//				}
	}

}
