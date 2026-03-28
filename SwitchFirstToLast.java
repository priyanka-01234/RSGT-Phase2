package stringPrograms;

public class SwitchFirstToLast {
	public static void main(String[] args) {
		String s = "Priyanka";
		int len = s.length();
		String result = "";
		result = result + s.charAt(len-1);
		//System.out.println(result); a
		for(int i = 1; i<s.length()-1; i++) {
			char ch = s.charAt(i);
			result= result+ ch;
		}
			//System.out.print(result);      ariyank
			result = result + s.charAt(0);
		System.out.println(result);
	}

}
