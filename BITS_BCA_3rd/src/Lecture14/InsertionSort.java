package Lecture14;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] arr = {5,3,-7,4,8,2};
		int len = arr.length;
		for(int i = 1; i < arr.length; i++) {
			correctLastElement(arr, i);
		}
		
		for(int i = 0; i < len ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void correctLastElement(int[] arr, int idx) {
		int temp = arr[idx];
		int start = idx - 1;
		while(start >= 0) {
			int currElement = arr[start];
			if(currElement < temp) {
				break;
			}
			
			arr[start + 1] = currElement;
			start--;
		}
		
		arr[start + 1] = temp;
	}

}
