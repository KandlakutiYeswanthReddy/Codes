
interface Abc{
	
	default void show() {
		System.out.println("Hi");
	}
}

interface Pqr{
	default void show() {
		System.out.println("Hello");
	}
}

class AbcImpl implements Abc,Pqr{

	
	public void show() {
		
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		AbcImpl obj = new AbcImpl();
		obj.show();
	}

}
