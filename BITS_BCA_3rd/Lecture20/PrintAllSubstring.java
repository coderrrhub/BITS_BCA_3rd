package Lecture20;

public class PrintAllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		
		for(int start = 0; start < s.length(); start++) {
			for(int end = start + 1; end <= s.length(); end++) {
				System.out.println(s.substring(start, end));
			}
		}
	}

}
