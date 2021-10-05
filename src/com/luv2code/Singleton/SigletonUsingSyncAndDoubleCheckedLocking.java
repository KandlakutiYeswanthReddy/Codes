package com.luv2code.Singleton;

public class SigletonUsingSyncAndDoubleCheckedLocking {

	public static void main(String[] args) {
		
		Thread T1 = new Thread(new Runnable()
		{
			public void run()
			{
				
				AbcSync obj = AbcSync.getInstance();
			}
		});
		
		Thread T2 = new Thread(new Runnable()
		{
			public void run()
			{
				
				AbcSync obj1 = AbcSync.getInstance();
			}
		});
		
		T1.start();
		T2.start();

	}

}

class AbcSync {

	public static AbcSync obj;

	private AbcSync() {
		System.out.println("instance created");
	}

	public static AbcSync getInstance() {

		if (obj == null) 
		{
			synchronized(AbcSync.class) {
				if(obj==null) 
					obj = new AbcSync();
				
			}
			
		}
		return obj;
	}
}
