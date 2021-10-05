package InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamAdvanced {

	public static void main(String[] args) {

		List<Employee2> empList = new ArrayList<>();
		empList.add(new Employee2(101, "siva", 1, "active", 2000));
		empList.add(new Employee2(102, "reddy", 2, "inactive", 4000));
		empList.add(new Employee2(103, "raju", 2, "active", 6000));
		empList.add(new Employee2(104, "babu", 3, "inactive", 3500));
		empList.add(new Employee2(105, "sai", 4, "active", 5000));
		empList.add(new Employee2(106, "jagdish", 4, "active", 5000));
		empList.add(new Employee2(107, "yeswanth", 4, "active", 5000));

		// to print employee details based on dept
		Map<Integer, List<Employee2>> empListBadedonDept = empList.stream()
				.collect(Collectors.groupingBy(Employee2::getDeptId, Collectors.toList()));
		empListBadedonDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "------" + entry.getValue());
		});

		// to print emplyee count working in each department
		Map<Integer, Long> empCountDept = empList.stream()
				.collect(Collectors.groupingBy(Employee2::getDeptId, Collectors.counting()));
		empCountDept.entrySet().forEach(entry -> {
			System.out.println("dept :" + entry.getKey() + "----" + entry.getValue());
		});

		// to print active and inactive employee in given collection
		long activeCount = empList.stream().filter(e -> "active".equals(e.getStatus())).count();
		long inactiveCount = empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
		System.out.println("active emp count :" + activeCount);
		System.out.println("inactive emp count :" + inactiveCount);

		// to print the max an min salary employee from given collection
		Optional<Employee2> maxsalary = empList.stream().max(Comparator.comparing(Employee2::getSalary));
		Optional<Employee2> minsalary = empList.stream().min(Comparator.comparing(Employee2::getSalary));

		System.out.println(maxsalary);
		System.out.println(minsalary);

		// to print max salary of employee from each depatrment

		Map<Integer, Optional<Employee2>> topSlaryInEachDept = empList.stream()
				.collect(Collectors.groupingBy(Employee2::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee2::getSalary)))));

		topSlaryInEachDept.entrySet().forEach(entry -> {
			System.out.println("dept " + entry.getKey() + "top emp" + entry.getValue());
		});

	}

}
