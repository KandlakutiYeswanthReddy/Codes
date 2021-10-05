package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExp {

	public static void main(String[] args) {
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1, 88));
		studs.add(new Student(2, 98));
		studs.add(new Student(1, 99));
		studs.add(new Student(1, 77));
		studs.add(new Student(1, 68));

		Collections.sort(studs, (s1, s2) -> {

			// return s1.marks>s2.marks?-1:1;

			return s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0;
		});

		for (Student s : studs) {
			System.out.println(s);
		}
	}
}
class Student {

	int rollno;
	int marks;

	public Student(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

}
