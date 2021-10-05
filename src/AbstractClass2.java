
public class AbstractClass2 
{

	public static void main(String[] args) 
	{

		Iphone obj = new Iphone();
		SamsungS7 obj1 = new SamsungS7();
		show(obj);
	}

	public static void show(Phone obj) 
	{
		
		obj.showConfig();
	}
}

abstract class Phone
{
	public abstract void showConfig();
}

class Iphone extends Phone
{
	public void showConfig() 
	{
		System.out.println("2 Gb, Ios, 9.3");
	}

	
}
class SamsungS7 extends Phone
{
	public void showConfig() 
	{
		System.out.println("2 Gb, lolipop");
	}
}