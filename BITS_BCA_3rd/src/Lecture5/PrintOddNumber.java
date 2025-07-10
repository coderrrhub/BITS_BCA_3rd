package Lecture5;
import java.util.*;
public class PrintOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i = 1; i <= n; i += 2) {
//			System.out.println(i);
//		}
		
//		for(int i = 1; i <= n; i += 2) {
//			if(i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println(i); // statement ----> even number
		}
	}

}
