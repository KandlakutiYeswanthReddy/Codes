package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	
	public static void main(String[] args) {
		
		List<Employee1> empList = createEmployeeList();
		List<Employee1> outputList = empList.stream().filter(emp->emp.getAge() >25).collect(Collectors.toList());
	//	outputList.forEach(emp -> System.out.println(emp));
		
		List<String> outputMapList = empList.stream().map(Employee1 :: getName).collect(Collectors.toList());
		outputMapList.forEach(emp -> System.out.println(emp));
		
 	}

	private static List<Employee1> createEmployeeList() {
		List<Employee1> empList = new ArrayList<>();
		
		Employee1 e1 = new Employee1("Amit", "1","ajmer",21);
		Employee1 e2 = new Employee1("hi", "2","ajmer",22);
		Employee1 e3 = new Employee1("hello", "3","ajmer",19);
		Employee1 e4 = new Employee1("Reddy", "4","ajmer",26);
		Employee1 e5 = new Employee1("Jagdish", "5","ajmer",26);
		Employee1 e6 = new Employee1("sai", "6","ajmer",27);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		return empList;
	}

}
