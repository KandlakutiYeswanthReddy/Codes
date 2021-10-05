package Java8Stream;

import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTermnalOperations {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "code1");
		Employee e2 = new Employee(2, "code22");
		Employee e3 = new Employee(3, "code333");
		Employee e4 = new Employee(4, "code4444");
		
		List <Employee> empList  = Arrays.asList(e1,e2,e3,e4);
		
		List <Integer> intList  = Arrays.asList(1,2,3,4,5);
		
		//System.out.println(intList.stream().filter(a -> a%2 == 0).peek(System.out::println).map(a -> a+a).filter(a -> a>5).count());
		
//		int sum =0;
//		for(int i =0; i<=5;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		System.out.println(intList.stream().reduce((a,b) -> a+b).get());
		
	}
}

class Employee {
	
	private int id;
	private String name;
	
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void pritName() {
		System.out.println("In Emp class :" + name );
	}
	

}
