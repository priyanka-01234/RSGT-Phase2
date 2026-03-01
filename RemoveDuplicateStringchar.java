package stringPrograms;

public class RemoveDuplicateStringchar {

	public static void main(String[] args) {
		String s = "Hello";
		String result = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			
			if (result.indexOf(ch) == -1) {
				result = result + ch;
			}
		}
		System.out.println("String after removing duplicate characters: " + result);
	}

}
