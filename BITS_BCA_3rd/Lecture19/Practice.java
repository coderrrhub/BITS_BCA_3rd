package Lecture19;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Bye";
		String s3 = "Hello";
		String s4 = new String("Hello");
		String s5 = new String("Hello");
		String s6 = s1;
		String s7 = "Hello" + "Bye"; // ---> HelloBye
		String s8 = s1 + s2; // s8 ---> HelloBye
		String s9 = "Hello" + s2; // ---> HelloBye
		String s10 = "HelloBye";
		// Address checking		
		System.out.println(s1 == s6); // true
		System.out.println(s3 == s6); // true
		System.out.println(s7 == s8); // true
		System.out.println(s8 == s9); // true
		System.out.println(s7 == s9); // true
		System.out.println(s10 == s7);
		
//		System.out.println(s1 == s3); // true
//		System.out.println(s1 == s2);// false
//		System.out.println(s2 == s3); // false
//		System.out.println(s4 == s5); // false
//		System.out.println(s1 == s4); // false
		
		// Content checking
//		System.out.println(s1.equals(s3)); // true
//		System.out.println(s1.equals(s2));// false
//		System.out.println(s2.equals(s3)); // false
//		System.out.println(s4.equals(s5)); // true
//		System.out.println(s1.equals(s4)); // true
//		System.out.println("abcde".equals("abcd"));   // "abcde".equals("abcde");
		
//		int a = 10;
//		int b = 10;
//		int c = 20;
//		System.out.println(a == b); // true
//		System.out.println(a == c); // false
	}

}
