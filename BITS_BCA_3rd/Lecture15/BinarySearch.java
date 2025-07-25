package Lecture15;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5,7,8,9,15,18,22,29,33,44,56};
		int target = 18;
		int targetIndex = binarySearch(arr, target);
		System.out.println(targetIndex);
	}
	
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == target) {
				return mid; // mid is the position where the target element is present
			} else if(arr[mid] < target) {
				low = mid + 1; // go to the right side
			} else {
				high = mid - 1; // for arr[mid] > target  (go to the left side)
			}
		}
		
		return -1; // -1 indicates target element is not present in the array
	}

}
