package Lecture3;
import java.util.*;
public class MaximumThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b && a >= c) {
			System.out.print(a + " a is Maximum");
		} else if(b > c) {
			System.out.print(b + " b is Maximum");
		} else {
			System.out.print(c + " c is Maximum");
		}
	}
}
