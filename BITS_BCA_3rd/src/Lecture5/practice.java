package Lecture5;
import java.util.*;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> frequency = new HashMap<>();
		String s = "ababbccdABAA";
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
			frequency.put(ch, frequency.getOrDefault(ch, 0)     + 1);
		}
//		
		System.out.println(frequency);
	}

}
