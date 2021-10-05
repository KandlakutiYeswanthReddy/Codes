package Java8.LambdaDemo;

interface Calculator {
	// void switchOn();
	// void switchOn(int input);
	int subtract(int i1, int i2);
}

public class LambdaDemoWithFunctionalInterface {
	public static void main(String[] args) {

//		Calculator cal = () -> System.out.println("hi");
//		cal.switchOn();

//		Calculator cal = (input) -> System.out.println("input is :" + input);
//		cal.switchOn(10);

		Calculator cal = (i1, i2) -> {
			if (i1 < i2) {
				throw new RuntimeException("Error");
			} else {
				return i2 - i1;
			}
		};
		System.out.println(cal.subtract(10, 2));
	}
}
