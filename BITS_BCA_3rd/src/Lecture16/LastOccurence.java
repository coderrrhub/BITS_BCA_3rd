package Lecture16;
// Problem Link:- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class LastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,6,7,7,7,7,7,9,11,27,29,33};
		int target = 7;
		System.out.println(lastPosition(arr, target));
	}
	
	public static int lastPosition(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
        int ans = -1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == target) {
				ans = mid; // mid is the position where the target element is present
                low = mid + 1;
			} else if(arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1; // for arr[mid] > target
			}
		}
		
		return ans; // -1 indicates target element is not present in the array
	}

}
