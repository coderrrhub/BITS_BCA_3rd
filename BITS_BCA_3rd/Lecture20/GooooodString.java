package Lecture20;

public class GooooodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaeicde";
		int max = 0;
		for(int start = 0; start < s.length(); start++) {
			if(! isCharacterVowel(s.charAt(start)) ) {
				continue;
			}
			for(int end = start + 1; end < s.length(); end++) {
				
				if(!isCharacterVowel(s.charAt(end))) {
					break;
				}
				
				
				max = Math.max(max, end - start + 1);
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

}
