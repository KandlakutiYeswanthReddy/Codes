package com.luv2code.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
	public static void main(String[] args) {
		List<Student1> studs = new ArrayList<>();
		studs.add(new Student1(1, 88));
		studs.add(new Student1(2, 98));
		studs.add(new Student1(1, 99));
		studs.add(new Student1(1, 77));
		studs.add(new Student1(1, 68));

		Collections.sort(studs);

		for (Student1 ss : studs) {
			System.out.println(ss);
		}
	}
}
class Student1 implements Comparable<Student1> {

	int rollno;
	int marks;

	public Student1(int rollno, int marks) {
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student1 ss) {

		return this.marks > ss.marks ? -1 : 1;
	}
}