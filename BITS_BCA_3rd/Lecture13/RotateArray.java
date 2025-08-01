package Lecture13;

// Problem Link :- https://leetcode.com/problems/rotate-array/description/
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		int k = 3;
		reverse(arr, 0, arr.length-1);
		
		reverse(arr, 0, k-1);
		
		reverse(arr, k, arr.length - 1);
		
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

}
