
public class SuperKeyword2 {

	public static void main(String[] args) {
		
		BB obj = new BB();
		obj.show();
		obj.abc();
		

	}

}
class AA{
	int i=5;
	public void show() {
		System.out.println(i);
	}
	
	public void abc() {
		System.out.println(" in AA Abc");
	}
}
class BB extends AA{
	int i=4;
	
		public void show() {
		//System.out.println(super.i);  // even it has i value in BB class since we are using Super.i i will fetch the i value from super class
	}
	
		
	public void abc() {
		super.abc();				// normally when we call obj.abc since we have that method in child class it will override the super clas method and
									//print only child class method ,sonce we are using super keyword i will also call parent class methd too.
		System.out.println(" in BB Abc");
	}
}