package Collection;

import java.util.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class MapComparingByKey {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Vijay");
		map.put(101, "Rahul");
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				.stream()
				//.sorted(Map.Entry.comparingByKey())
				 //Sorted according to the provided Comparator  i.e reverse order
			     .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
				.forEach(System.out::println);
	}
}