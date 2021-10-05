package com.luv2code.Collection;

import java.util.ArrayList;

public class CurrentTimeMillis {

	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
		
		ArrayList a = new ArrayList();
		
		for(int i=1; i<10000; i++) 
		{
			a.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);

	}

}
