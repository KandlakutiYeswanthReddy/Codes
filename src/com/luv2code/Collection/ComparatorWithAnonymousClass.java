package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithAnonymousClass {

	public static void main(String[] args) {

		List<Integer> c = new ArrayList();

		c.add(118);
		c.add(217);
		c.add(223);
		c.add(224);

		// c.add(1,9);

		// using anonymous class

		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {

				if (o1 % 10 > o2 % 10)
					return 1;

				return -1;

			}
		};

		Collections.sort(c, com); // ascendig order

		c.forEach(System.out::println); // Stream Api.. it uses lamda expression

	}
}
