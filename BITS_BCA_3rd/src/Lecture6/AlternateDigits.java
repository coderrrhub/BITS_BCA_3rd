package Lecture6;

public class AlternateDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum += rem;
			n/=100;
		}
		System.out.print(sum);

	}

}
