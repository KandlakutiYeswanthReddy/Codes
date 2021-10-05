package Constructor;

public class CostructorDemo {

	public static void main(String[] args) {

		//Abc obj = new Abc();
		Abc obj = new Abc(6);
		//Abc obj = new Abc(7, 5.0);
	}
}

class Abc {

	public Abc() {

		System.out.println(" Insdie the constructor");

	}

	public Abc(int k) {

		System.out.println(" Insdie the param constructor");

	}

	public Abc(int m, double j) {

		System.out.println(" Insdie the param constructor with 2 parameters");

	}
}
