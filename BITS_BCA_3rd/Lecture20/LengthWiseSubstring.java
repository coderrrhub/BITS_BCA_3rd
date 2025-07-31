package Lecture20;

public class LengthWiseSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		
		for(int len = 1; len <= s.length(); len++) {
			for(int end = len; end <= s.length(); end++) {
				int start = end - len;
				System.out.println(s.substring(start, end));
			}
		}
	}

}
