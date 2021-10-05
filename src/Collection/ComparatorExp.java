package Collection;

import java.util.*;

public class ComparatorExp {
	public static void main(String args[]) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(101, "Vijay", 23));
		al.add(new Student1(106, "Ajay", 27));
		al.add(new Student1(105, "Jai", 21));
//Sorting elements on the basis of name 
		
		Comparator<Student1> cm1 = Comparator.comparing(Student1::getName);
		Collections.sort(al, cm1);
		System.out.println("Sorting by Name");
		for (Student1 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		// Sorting elements on the basis of age
		Comparator<Student1> cm2 = Comparator.comparing(Student1::getAge);
		Collections.sort(al, cm2);
		System.out.println("Sorting by Age");
		for (Student1 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}

class Student1 {
	int rollno;
	String name;
	int age;

	Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
