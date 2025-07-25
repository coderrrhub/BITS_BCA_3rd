package Lecture13;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-enerated method stub
		int[] arr = {1,2,3,4,5}; // 1,2,5,4,3
//		reverse(arr);
		
		reverse(arr, 2, arr.length - 1); // start to end(whole array)
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void reverse(int[] arr, int start, int end) {
		
		while(start <= end) {
			swap(arr, start, end); // call by reference
			start++;
			end--;
		}
	}
	
	
//	public static void reverse(int[] arr) {
//		int[] other = new int[arr.length];
//		int pos = 0;
//		for(int i = arr.length - 1; i >= 0; i--) {
//			other[pos] = arr[i];
//			pos++;
//		}
//		
//		// Display
//	}

}
