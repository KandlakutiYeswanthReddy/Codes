
class Abcd {

	void display(Object o) {
		System.out.println("object");
	}
	void display(float f) {
		System.out.println("float");
	}
	void display(String s) {
		System.out.println(" String");
	}
}

public class Imp{
	 
	 public static void main(String[] args) {
		 Abcd obj1 = new Abcd();
	
		obj1.display(20.22);
	}
}
