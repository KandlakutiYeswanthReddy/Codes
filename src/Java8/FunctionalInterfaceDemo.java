package Java8;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	void oneAbstMeths();
	//void oneAbstMeths1();
	
	default void firstdefault() {
		System.out.println("First method");
	}

	default void seconddefault() {
		System.out.println("Second method");
	}
}
