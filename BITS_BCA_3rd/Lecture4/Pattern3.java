package Lecture4;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while(row <= n) {
			int i = 1;
			// printing star
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			
			// preparation for the next row
			System.out.println();
			row++;
			star--;
		}
	}

}
