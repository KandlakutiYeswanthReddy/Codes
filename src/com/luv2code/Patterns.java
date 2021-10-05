package com.luv2code;

public class Patterns {

	public static void main(String[] args ) {
		
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		//2 nd
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.print(i +" ");
			}
			System.out.println("");
		}

		System.out.println("");
		
		// 3rd
		
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		//4th
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				
							
				int k=i+j;
				if (k>4)
					System.out.print(k-4 + " ");
				else
					System.out.print(k + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		// 5th
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println("");
		}

			System.out.println("");
	
	
	// 6th
			for (int i = 1; i <= 4; i++) {

				for (int j = 1; j <= i; j++) {

					
						System.out.print(i + " ");
					
				}
				System.out.println("");
			}

				System.out.println("");
		}
	
}


