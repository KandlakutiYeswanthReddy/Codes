package InterviewQuestions;

public class Employee1 {
	
	private String name;
	private String id;
	private String lastName;
	private int age;
	
	
	public Employee1(String name, String id, String lastName, int age) {
		this.name = name;
		this.id = id;
		this.lastName = lastName;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	

}
