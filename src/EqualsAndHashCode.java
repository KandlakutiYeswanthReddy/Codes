
public class EqualsAndHashCode {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("paul");
		Employee e2 = new Employee();
		e2.setId(1);
		e2.setName("paul");

		System.out.println("Shallow Compare :" + (e1 == e2));

		System.out.println("Deep Compare :" + e1.equals(e2));

	}

}

class Employee {
	private int id;
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
	
	public boolean equals(Object o) {
		if(o == null || getClass()!= o.getClass()) {
			return false;
		}
		if(o == this) {
			return true;
		}
		Employee e = (Employee)o;
		return (this.getId()== e.getId());
	}
	public int hashcode() {
		return getId();
		
	}

}