package Lecture4;

public class MirrorPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		while(row <= 2*n-1) {
			int i = 1;
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			
			// preparation
			if(row < n) {
				star++;
			} else {
				star--;
			}
			System.out.println();
			row++;
		}
	}

}
