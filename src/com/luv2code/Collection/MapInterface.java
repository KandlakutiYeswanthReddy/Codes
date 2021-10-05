package com.luv2code.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("myname", "Yeswanth");
		map.put("actor","Dhanush");
		map.put("age", "Tewnetythree");
		
		Set <String> keys = map.keySet();
		
		for( String key : keys) {
			System.out.println(key +" " +map.get(key));
		}

	}

}
