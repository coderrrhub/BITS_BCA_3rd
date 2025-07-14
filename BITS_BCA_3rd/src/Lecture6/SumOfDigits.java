package Lecture6;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 456;
		int sum = 0;
		while(n > 0) {
			int rem = n % 10; // % used for remainder (10 is used for single digit)
			sum = sum + rem;
			n = n / 10; // / used for quotient (10 is used to remove single digit and single digit will be the last digit)
		}
		
		System.out.println(sum);
	}

}
