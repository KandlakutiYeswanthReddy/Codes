package Collection;

import java.util.HashMap;

public class HashMapExmp {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Hi", 1);
		map.put("hello", 1);
		map.put("Hi", 3);

		System.out.println(map);
	}

}
