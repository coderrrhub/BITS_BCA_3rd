package Lecture7;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 87;
		int sum = 0;
		int pos = 1;
		while(n > 0) {
			int rem = n % 2;
			sum = sum + rem * pos;
			pos = pos * 10;
			n = n / 2;
		}
		
		System.out.print(sum);
	}

}
