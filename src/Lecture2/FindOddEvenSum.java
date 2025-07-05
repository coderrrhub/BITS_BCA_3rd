package Lecture2;
import java.util.*;
public class FindOddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int oddSum = 0;
		int evenSum = 0;
		while(i <= N) {
			if(i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
			
			
			i = i + 1;
		}
		
		System.out.println("Even sum is " + evenSum);
		System.out.println("Odd sum is "+ oddSum);

	}

}
