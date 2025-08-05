package Lecture23;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cactt";
		String t = "atctd"; // t = "d"
		
		System.out.println(isValidAnagram(s,t));
	}
	
	static boolean isValidAnagram(String s, String t) {
		int[] freq = new int[26]; // by default value 0
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			
			freq[index]++;
		}
		
		for(int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			int index = ch - 'a';
			
			freq[index]--;
		}
		
		for(int i = 0; i < 26; i++) {
			if(freq[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
	
//	static boolean isValidAnagram(String s, String t) {
//		// s and t are of different length
//		if(s.length() != t.length()) {
//			return false;
//		}
//		
//		for(int i = 0; i < s.length(); i++) {
//			char ch1 = s.charAt(i);
//			for(int j = 0; j < t.length(); j++) {
//				char ch2 = t.charAt(j);
//				
//				if(ch1 == ch2) {
//					t = t.substring(0, j) + t.substring(j+1);
//					break;
//				}
//			}
//		}
//		
//		// t string me delete kar rahe
//		if(t.length() == 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
