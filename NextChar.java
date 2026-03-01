package stringPrograms;

public class NextChar {
public static void main(String[] args) {
	String s = "aceg";
	String result = " ";
	
	for(int i =0; i<s.length(); i++) {
		char ch  = s.charAt(i);
		result = result + (char)(ch +1);
		
	}
	System.out.println(result);
}
}
