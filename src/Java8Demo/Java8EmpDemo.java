package Java8Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8EmpDemo {

	public static void main(String[] args) {
		
		List <Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 2000));
		empList.add(new Employee(5, 2500));
		empList.add(new Employee(6, 3000));
		empList.add(new Employee(7, 3500));
		
		List<Employee> empSortedList =	empList.stream().sorted((o1, o2)-> (int)(o2.getSalary()-o1.getSalary()))
								 //.limit(3)   //to get first 3 higher salaries
									.skip(3)		//to get remaining salaries which are less than 3 rd highest (except first 3 )
									.collect(Collectors.toList());
										
		System.out.println(empSortedList);

	}

}
