package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
	
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(52);
		arList.add(35);
		arList.add(5);
		
//		Stream s = arList.stream().map(i -> 2 * i);
//		s.forEach(x -> System.out.println(x));
		
		arList.stream()   							//creation of stream
			.map(i -> 2 * i)							// configuration of stream
			.forEach(x -> System.out.println(x));		// processing of stream

	}

}
