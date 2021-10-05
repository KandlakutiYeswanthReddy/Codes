package com.luv2code.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling {

	public static void main(String[] args) throws Exception {
		
		File f = new File("Demo.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo Content");
		
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		
		System.out.println(str);
		
		
		
	}

}
