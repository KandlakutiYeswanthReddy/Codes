package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String input = "AABCDDCEE";
		

		// Approch -1, without collection

//		for (int i = 0; i < input.length(); i++) {
//			boolean unique = true;
//			for (int j = 0; j < input.length(); j++) {
//				if (i != j && input.charAt(i) == input.charAt(j)) {
//					unique = false;
//					break;
//
//				}
//			}
//
//			if (unique) {
//				System.out.println(input.charAt(i));
//				break;
//			}
//		}

		// Approch -2 using collections

		Map<Character, Integer> map = new HashMap<>();
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			//char[] ch = input.toCharArray();
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
		
		//or
		
		for(char ch : input.toCharArray()) {
			map.put(ch, map.containsKey(ch)? map.get(ch)+1 : 1);
		}

		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("The first non repeated char is : " + entry.getKey());
				break;
			}
			
		}
		
	}

}
