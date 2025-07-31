package Lecture20;

public class CheckForVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "iioueaze";
		System.out.println(allVowels(s));
	}
	
	public static boolean allVowels(String s) {
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}

}
