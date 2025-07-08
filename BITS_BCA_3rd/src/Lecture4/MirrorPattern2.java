package Lecture4;

public class MirrorPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while(row <= 2*n-1) {
			// print space
			int j = 1;
			while(j <= space) {
				System.out.print(" ");
				j++;
			}
			
			// print star
			int i = 1;
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			
			// preparation for Mirror condition
			if(row < n) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			System.out.println();
			row++;
		}
	}

}
