package Lecture23;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][4]; // row = 5 col = 4;
		for(int col = 0; col < arr[0].length; col++) {
			for(int row = 0; row < arr.length; row++) {
				arr[row][col] = row + col; // value kaise rakhte hai
				System.out.println(arr[row][col] +"  "+row+"  "+col); // value kaise get karte
			}
		}
		
		// Row-wise
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				arr[row][col] = row + col; // value kaise rakhte hai
				System.out.println(arr[row][col] +"  "+row+"  "+col); // value kaise get karte
			}
		}
		
		
		
//		System.out.println("Row Length "+ arr.length);
//		System.out.println("Col Length " + arr[0].length); // arr[] ---> 0 ... row.length-1
//		// whenever we need to find the column length so we always use arr[0].length to avoid error
		
		
//		int[][][] arr = new int[5][][];
	}

}
