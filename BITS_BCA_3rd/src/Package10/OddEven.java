package Package10;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            // num ---> Yes otherwise No
            oddEvenSum(num);
        }
	}
	
	static void oddEvenSum(int n) {
		int oddSum = 0;
		int evenSum = 0;
		while(n > 0) {
			int digit = n % 10;
			
			if(digit % 2 == 0) {
				evenSum = evenSum + digit;
			} else {
				oddSum = oddSum + digit;
			}
			
			n = n/10;
		}
		
		if(evenSum % 4 == 0 || oddSum % 3 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
