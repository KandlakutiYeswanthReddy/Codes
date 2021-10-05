
public class AbstractClass {

	public static void main(String[] args) {
			 
		MaheshPhone obj = new SureshPhone();
		obj.call();
		obj.dance();
		obj.cook();
		obj.camera();
	}

}

abstract class MaheshPhone //abstract methods
{

	public void call()    //method definition
	{
		System.out.println("calling ...");
	}	
	public abstract void dance();    //method deceleration hence abstract methods
	public abstract void cook();
	public abstract void camera();
	}


abstract class RameshPhone extends MaheshPhone //abstract class
{

	public void dance() {
		System.out.println("Dancing ...");
	}
}

class SureshPhone extends RameshPhone   //Concrete class: A class which implements all abstract method of supr class
{

	
	public void cook() {
		System.out.println("cooking ..");
		
	}

	
	public void camera() {
		System.out.println("clicking ...");
		
	}

}
