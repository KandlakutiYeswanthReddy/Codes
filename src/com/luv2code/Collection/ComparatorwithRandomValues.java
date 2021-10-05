package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComparatorwithRandomValues {

	public static void main(String[] args) {
		
		
		List<Integer> c = new ArrayList<>();
		
		Random r = new Random();
		
		for(int i=1;i<100;i++) {
			c.add(r.nextInt(1000));
		}
		
		Collections.sort(c, (i1,i2) -> 
		{
			return i1%10>i2%10?1:i1%10<i2%10?-1:0;
		});
		
		
		for( Integer o : c) {
			System.out.println(o);
		}
	}

}
