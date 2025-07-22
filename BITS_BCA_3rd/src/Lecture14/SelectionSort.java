package Lecture14;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,-7,4,8,2,5,6,3};
		int len = arr.length;
		for(int i = 0; i < len - 1; i++) {
			int idx = minIndex(arr, i);
			
			// swap ---> i and idx
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		for(int i = 0; i < len ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int minIndex(int[] arr, int start) {
		int minIdx = start; // start element wahin abhi tak ka minimum element
		
		for(int i = start + 1; i < arr.length; i++) {
			// 2 element compare
			int minElement = arr[minIdx];
			int currElement = arr[i];
			
			if(currElement < minElement) {
				minIdx = i;
			}
		}
		
		return minIdx;
	}

}
