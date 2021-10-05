
 class A1 {
	int a = 100;
}

class B1 extends A1{
	int a =200;
	
	public class Test {
	
		public static void main(String[] args) {
			
				A1 a = new B1();
				System.out.println(a.a);
		}
	}
	

}

//public class Test{
//	public int var;
//	
//	public Test(int var) {
//		this.var = var;
//	}
//	
//	public static void main(String[] args) {
//		Test obj = new Test(25);
//		System.out.println(obj.var);
//	}
//		
//	
//}