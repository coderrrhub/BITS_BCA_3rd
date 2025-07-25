package Lecture4;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int space = 2*n-3;
		int row = 1;
		while(row <= n) {
			// star print
			int j = 1;
			while(j <= star) {
				System.out.print("*");
				j++;
			}

			// space print
			int i = 1;
			while(i <= space) {
				System.out.print(" ");
				i++;
			}
			
			// star print
			int k = 1;
			while(k <= star) {
				System.out.print("*");
				k++;
			}
			
			
			
			// preparation for the next row
			System.out.println();
			row++;
			space -= 2;
			star++;
		}
	}

}
