package Lecture20;

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaeicde";
		int max = 0;
		for(int start = 0; start < s.length(); start++) {
			if(! isCharacterVowel(s.charAt(start)) ) {
				continue;
			}
			for(int end = start + 1; end <= s.length(); end++) {
				
				
				
				String sub = s.substring(start, end);
				
				if( allVowels(sub) ) {
					max = Math.max(max, sub.length());
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static boolean isCharacterVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		
		return false;
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
