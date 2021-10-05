package com.luv2code.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		Save obj = new Save();
		obj.i=4;
		
		File f = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 =(Save) ois.readObject();

		System.out.println("value of obj1: " +obj1.i);
	}
	

}

class Save implements Serializable
{
	int i;
}

