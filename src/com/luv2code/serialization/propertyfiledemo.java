package com.luv2code.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertyfiledemo {

	public static void main(String[] args) throws Exception{
		
		Properties p = new Properties();
		
		
		//to store the data in properties file
		
//		OutputStream os = new FileOutputStream("dataConfig.properties");
//		
//		p.setProperty("url", "localhost:\\3306\\mysql");
//		p.setProperty("uname", "yeswanth");
//		p.setProperty("pass", "0000");
//		
//		p.store(os, null);
		
		//to retrive from properties file
		
		InputStream is = new FileInputStream("dataConfig.properties");
		p.load(is);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		
		//to list all elements in console
		
		p.list(System.out);

	}

}
