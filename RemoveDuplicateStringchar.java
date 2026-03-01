package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateStringchar {

	public static void main(String[] args) {
		String s = "Hello";
		String result = "";
		LinkedHashSet<Character> set =  new LinkedHashSet();
		
		char[] ch  = s.toCharArray();
		for(Character c : ch) {
			set.add(c);
		}
		
		System.out.println(set);
		
		for(char duplicate : set) {
			result = result+duplicate;
			
		}
		/*String result = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);	
			
		/*	if (result.indexOf(ch) == -1) {
				result = result + ch;
			}
		}*/
		System.out.println("String after removing duplicate characters: " + result);
		
		
	}

}
