package Lecture19;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Hello"; // Hello (SCP/IP) address
//		String s2 = "Bye";   // Bye (SCP/IP) address
//		String s5 = "ByeHello"; // ByeHello (SCP/IP) address
//		s2 = s2 + "Hello";  // ByeHello
//		String s3 = s1 + s2; // HelloBye outside SCP/IP
//		String s4 = s1.concat(s2); // HelloBye outside SCP/IP
		
		// compareTo
//		String s1 = "abcde";
//		String s2 = "abcde";
//		System.out.println(s1.compareTo(s2)); 
		
//		String s1 = "abcde";
//		String s2 = "bbcde";
//		System.out.println(s1.compareTo(s2)); 
		
//		String s1 = "abcde";
//		String s2 = "abdde";
//		System.out.println(s1.compareTo(s2)); 
//		System.out.println(s2.compareTo(s1)); 
		
//		String s1 = "abcde";
//		String s2 = "abcde";
//		System.out.println(compareTo(s1, s2)); // s1.compareTo(s2);
//		System.out.println(compareTo(s2, s1)); // s2.compareTo(s1);
		
//		String s1 = "abcde";
//		String s2 = "abdde";
//		System.out.println(compareTo(s1, s2)); // -1
//		System.out.println(compareTo(s2, s1)); // +1
		
//		String s1 = "abcd";
//		String s2 = "abcde";
//		System.out.println(compareTo(s1, s2)); // s1.compareTo(s2);
//		System.out.println(compareTo(s2, s1));
//		System.out.println(s1.compareTo(s2)); //-1 (len1 < len2) --> all same length value same
//		System.out.println(s2.compareTo(s1)); // +1 (len1 > len2)
		
		String s = "abcdefgh";
		System.out.println(s.substring(2, 6));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,s.length()));
		System.out.println(substring(s, 2, 6));
		System.out.println(substring(s, 3));
		
//		String s1 = "abcde";
//		String s2 = "abcd";
//		System.out.println(compareTo(s1, s2)); 
//		System.out.println(compareTo(s2, s1));
//		System.out.println(s1.compareTo(s2));  // +1
//		System.out.println(s2.compareTo(s1));  // -1
		
		
//		System.out.println(s1.compareTo(s2)); 
//		System.out.println(s2.compareTo(s1)); 
		
		
//		System.out.println(s3+"   "+s4);
//		System.out.println(5 + 10 + "Hello"+ 10 + 5 + "Bye");
//		System.out.println(5 + 10 + "Hello"+ (10 + 5) + "Bye");
//		System.out.println(s1.length() +"    "+s2.length()); // 5 aand 3
	}
	
	public static int compareTo(String s1, String s2) {
		// return either 0, -1, or 1
		if(s1 == s2) { // both strings are present in the same address i.e. in SCP/IP
			return 0;
		}
		
		int len1 = s1.length();
		int len2 = s2.length();
		// for equal
		
		for(int i = 0; i < Math.min(len1, len2); i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			if(ch1 < ch2) {
				return -1;
			} else if(ch1 > ch2) {
				return +1;
			}
			
			// if equal then go and check for the next character
		}
		
		if(len1 < len2) {
			return -1;
		} else {
			return +1;
		}
	}
	
	public static String substring(String s, int start) {
		String ans = "";
		for(int i = start; i < s.length(); i++) {
			char ch = s.charAt(i);
			ans = ans + ch;
		}
		
		return ans;
	}
	
	public static String substring(String s, int start, int end) {
		String ans = "";
		for(int i = start; i < end; i++) {
			char ch = s.charAt(i);
			ans = ans + ch;
		}
		
		return ans;
	}

}
