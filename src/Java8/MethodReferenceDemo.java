package Java8;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		FunctionalInterfaceDemo functionalInterfaceDemo = Test :: testImplementation;
		functionalInterfaceDemo.oneAbstMeths();
		
		//if no testImplementation is available in existing code then use following lambda exp
		
		FunctionalInterfaceDemo f = () -> System.out.println("Impl of SAM");
		f.oneAbstMeths();
	
	
	}

}

class Test{
	public static void testImplementation() {
		System.out.println("This is test imp od abstract method ");
	}
}
