package Lecture3;
import java.util.*;
public class SumNNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= N) {
			sum = sum + i;
			i = i + 1;
		}
		
		System.out.print(sum);
	}

}
