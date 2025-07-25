package Lecture5;

public class MirrorPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = 0;
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
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;
		}
	}

}
