package Lecture16;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,5,7,3,6,1,9};
		int target = 6;
		System.out.println(search(arr, target));
	}
	
	public static int search(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
