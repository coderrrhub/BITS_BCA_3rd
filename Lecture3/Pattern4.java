package Lecture3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int space = n - 1;
		int row = 1;
		while(row <= n) {
			// space print
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			
			// star print
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}
			
			
			
			// preparation for the next row
			System.out.println();
			row++;
			space--;
			star++;
		}
	}

}
