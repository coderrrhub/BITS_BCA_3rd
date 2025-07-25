package Lecture11;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean task = isArmstrongNumber(n);
	
		if(task == true) {
			System.out.println(n+" is a Armstrong Number");
		} else {
			System.out.println(n+" is not a Armstrong Number");
		}
	}
	
	static boolean isArmstrongNumber(int n) {
		int len = countOfDigits(n);
		
		int num = n;
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			int powerValue = power(digit, len);
			sum = sum + powerValue;
			
			n = n / 10;
		}
		
		if(sum == num) {
			return true;
		} else {
			return false;
		}
	}
	
	static int countOfDigits(int n) {
		int len = 0;
		while(n > 0) {
			len++;
			n = n / 10;
		}

		return len;
	}
	
	static int power(int a, int b) {
		int ans = 1;
		int i = 1;
		while(i <= b) {
			ans = ans * a;
			i++;
		}
		
		return ans;
	}

}
