package demo;

public class StrReplace {
	public static void main(String[] args) {
		String s = "1010";
		System.err.println(s.replace(s.charAt(0), (char)2).toString());
	}

}
