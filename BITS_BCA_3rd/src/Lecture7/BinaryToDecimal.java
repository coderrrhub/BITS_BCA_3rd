package Lecture7;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1010111; // 0,1
		int sum = 0;
		int pos = 1;
		while(n > 0) {
			int rem = n % 10;
			sum = sum + rem * pos;
			pos = pos * 2;
			n = n / 10;
		}
		
		System.out.print(sum);
	}

}
