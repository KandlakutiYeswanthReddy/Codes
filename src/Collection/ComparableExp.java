package Collection;

import java.util.*;

public class ComparableExp {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		
		return this.age -st.age;
		
//		if (age == st.age)
//			return 0;
//
//		else if (age > st.age) // ascending order
//			// else if (age < st.age) //descending order
//			return 1;
//		else
//			return -1;
	}
}