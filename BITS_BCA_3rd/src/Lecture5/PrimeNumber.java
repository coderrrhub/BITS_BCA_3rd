package Lecture5;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for( int i = 2;i <= n-1; i++) {
			if(n % i == 0) { // 8 % 2 == 0
				count++;  // count = 1;
				break;
			}
			System.out.println(i);
		}
		System.out.println(count); // 1
		// 2, 3,4,5,6,...(n-1)
		if(count == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
