package Lecture17;
// Problem Link:- https://leetcode.com/problems/search-insert-position/description/
public class FindInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(arr, target));
	}
	
	public static int searchInsert(int[] arr, int target) {
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
		
		return low;
    }
}
