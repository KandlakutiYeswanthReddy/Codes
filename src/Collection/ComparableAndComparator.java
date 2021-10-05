package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableAndComparator {
	public static void main(String[] args) {
		
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(5,"Ram");
		empArr[1] = new Employee(8,"Hi");
		empArr[2] = new Employee(10,"Who");
		empArr[3] = new Employee(2,"when");
		
		Arrays.sort(empArr);
		System.out.println("Sorted :" +Arrays.toString(empArr) );
		
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("Sorted :" +Arrays.toString(empArr) );
	}
}

class Employee implements Comparable<Employee>{
	
	private int  id;
	private String name;
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
	
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.id - o.id;
	}
	
	public static Comparator <Employee> NameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
	
	
}