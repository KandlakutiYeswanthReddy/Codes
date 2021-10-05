package com.luv2code.String;

public class ToString {
	
	public static void main(String[] ags) {
		
		Student s1= new Student(11, "yeswanth");
		System.out.println(s1);
		
	}

}

class Student{
	int rollno;
	String sname;
	
	public Student(int rollno, String sname) {
		this.rollno = rollno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}

	
	
}
