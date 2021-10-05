package InterviewQuestions;

public class EmployeeLToM {
	private String name;
	private String city;
	private String id;
	
	public EmployeeLToM(String name,  String city, String id) {
		this.name = name;
		this.city = city;
		this.id = id;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "LtoMEmployee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	

}
