package Lecture6;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 36;
		int b = 60;
		int steps = 0;
		while(true) {
			steps++;
			int rem = b % a;
			if(rem == 0) {
				// stopping point --- loop se bahar
				System.out.println(a);
				break;
			}
			b = a;
			a = rem;
		}
		
		System.out.println(steps);
	}

}
