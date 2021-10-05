package com.luv2code.serializationXml;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializeXml {
	
	public static void main(String[] args) {
		
		
		XMLDecoder x;
		try {
			x = new XMLDecoder(new BufferedInputStream(new FileInputStream("mycollege.xml")));
			
			College c= (College)x.readObject();
			
			List<Student> s = c.getStudents();
			
			for(Student val : s) {
				
				System.out.println(val);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	}

}
