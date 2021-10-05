package com.luv2code.String;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "   j    av  a     s   t   a   r   ";

		
		//trim() method is only used for removing leading and trailing
		//whitespace but not the white spaces inbetween string
		
		
		String trimmedStr = str.replaceAll("\\s", "");  // \\s is a unicode value represents single space
														// based on regExp replace all single space with empty
		System.out.println(trimmedStr);
	}

}
