package stringPrograms;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s  = "Hello skillio How are you";
		String []words = s.split(" ");
		for(String word : words) {
			for(int i = word.length()-1; i>=0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
