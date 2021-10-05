package Java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(52);
		arList.add(30);
		arList.add(5);
		
//		Stream s = arList.stream().filter(i -> i%2 ==0);
//		s.forEach(x -> System.out.println(x));
		
		List<Integer> list =arList.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		list.forEach(x -> System.out.println(x));
	}

}
