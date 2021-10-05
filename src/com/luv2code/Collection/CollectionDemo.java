package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		//with generics
		//Collection<Integer> c = new ArrayList();
		
		c.add(1);
		c.add(2.2);
		c.add("Yeswanth");
		
		c.remove(2.2);
		
		for(Object o : c) {
			System.out.println(o);
		}

	}

}
