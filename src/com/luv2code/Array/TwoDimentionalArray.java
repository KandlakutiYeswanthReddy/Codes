package com.luv2code.Array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int x[]= {5,6,7,8};
		int y[]= {6,7,8,9};
		int z[]= {7,8,9,9};
		
		int p[][] = {
					{5,6,7,8},
					{6,7,8,9},
					{7,8,9,9}	};
		
		
//		for( int i =0; i<3;i++) 
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(p[i][j] + " ");
//			}
//			System.out.println("");
//		}

		
		// Enhanced for loop
		
		for(int i[]: p) // in this i will fetch the whole array {5,6,7,8} from p because this {5,6,7,8}array is element for p  
		{
			for (int j : i)  // again we need to elements from i array
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}
