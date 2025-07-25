package Lecture13;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 96;
		arr[3] = 4;
		arr[4] = 101;
		
		arrSwap(arr);
		
	}
	static void arrSwap(int[] arr) {
		int max = arr[0];
		for(int i = 0; i<=4;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
				
		}
		System.out.print(max);
	}
}
