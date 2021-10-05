package Java8Demo;

public class Employee {

	private int id;
	private long salary;

	public Employee(int id, long salary) {
		this.id = id;
		this.salary = salary;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

}
