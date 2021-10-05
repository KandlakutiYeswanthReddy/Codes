package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLamdaExpression {


public static void main(String[] args) {
		
		List<Integer> c = new ArrayList();
		
				c.add(118);
				c.add(217);
				c.add(223);
				c.add(224);
				c.add(229);
				
				//c.add(1,9);
				
				// using anonymous class
							
				Collections.sort(c,( o1,  o2) ->{
					
					return o1%10>o2%10?1:-1;
				
			
				});  //ascendig order
				
			
				
				c.forEach(System.out::println); //Stream Api..  it uses lamda expression
				 
				
}
}

	

