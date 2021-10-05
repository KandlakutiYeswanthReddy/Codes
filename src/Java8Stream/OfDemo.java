package Java8Stream;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		
		Stream.of(1,11,11,111,1111,11).forEach(x -> System.out.println(x));
		
		String[] name = {"code", "decode", "demos"};
		Stream.of(name).filter(x -> x.length() > 4 ).forEach(x -> System.out.println(x));
		

	}

}
