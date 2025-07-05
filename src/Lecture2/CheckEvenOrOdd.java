package Lecture2;
import java.util.*;
public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			// true ---> even 0, 2,4,6,8,10
			System.out.print("The number is even " + n);
		} else {
			// odd number ---> 1,3,5,7,9....
			System.out.print("The number is odd " + n);
		}
	}

}
