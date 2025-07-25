package Lecture4;
import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while(row <= n) {
			// print star ---> n times
			int star = n;
			int i = 1;
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			
			row++;
			System.out.println();
		}
	}

}
