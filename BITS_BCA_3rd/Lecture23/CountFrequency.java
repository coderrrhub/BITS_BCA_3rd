package Lecture23;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babcdefz";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			System.out.println(ch +"  "+index);
		}
	}

}
