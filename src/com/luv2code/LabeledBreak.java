package com.luv2code;

public class LabeledBreak {

	public static void main(String[] args ) {
		
		navin: // labling
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4;j++) {
				if(i==3)
					
					//break; //unlabeed break ststment it will break only inner loop
					break navin;
			System.out.print("* ");
			}
			System.out.println("");
		}
		
		
	}
	
	
	
}


