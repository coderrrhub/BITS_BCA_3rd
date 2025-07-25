package Lecture7;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 60;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.print(i+"  ");
			}
		}
		
		System.out.print(n);
	}

}
