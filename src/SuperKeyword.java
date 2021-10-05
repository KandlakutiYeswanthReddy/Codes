
public class SuperKeyword {

	public static void main(String[] args) {
		
		B obj = new B();
		;//if we give the B(int j) method it will call this method and also calls the default method of super class
	}

}
class A{
	public A() {
		System.out.println("in const A");
	}
	public A(int i) {
		System.out.println("in const A int");
	}
}
class B extends A{
	
	public B(){
		System.out.println("In const B");
	}
	public B(int j){
		System.out.println("In const B int");
	}
}