package com.luv2code.serializationXml;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.jboss.logging.Logger;

public class SerializeXml {
	
	public static void main(String[] args) throws Exception{
		
		try {
		Student st1 = new Student();
		st1.setRollno(101);
		st1.setSname("Mangesh");
		
		Student st2 = new Student();
		st2.setRollno(102);
		st2.setSname("Ravi");
		
		List<Student> s = new ArrayList();
		s.add(st1);
		s.add(st2);
		
		College c	= new College();
		c.setStudents(s);
		
		
			XMLEncoder x= new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
			
			x.writeObject(c);
			x.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.getStackTrace();
		//	Logger.getLogger(SerializeXml.class.getName()).log(Level.SEVERE,null, e);
		}
		
	}

}
