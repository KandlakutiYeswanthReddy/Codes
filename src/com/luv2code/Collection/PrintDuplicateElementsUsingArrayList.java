package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementsUsingArrayList {

	public static void main(String[] args) {


		ArrayList<String> names = new ArrayList<>();
		
		names.add("Navin");
		names.add("Yeswanth");
		names.add("Reddy");
		names.add("Yeswanth");
		
		Set <String> st = new HashSet<>();
		
		for(String n : names) {
			
			if(st.add(n)== false)
				
			System.out.println(n);
		}

	}

}
