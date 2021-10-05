package com.luv2code.InnerClass;

import com.luv2code.InnerClass.A.B;

public class NestedClass {

	public static void main(String[] args) {
		
	
			
			//AA a = new AA();
			AA.BB obj = new AA.BB();   //a is instance of A class
			obj.show();

		}

	}

	class AA{
		int rollno;
		String name;
		
		static class BB{
			
		public void show() {
			System.out.println("Hello  static inner class");
		}
			
		}
	}