package Lecture14;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,-7,4,8,2};
		int len = arr.length;
		for(int turn = 1; turn < len; turn++) {
			// comparison always start from 0th index
			for(int i = 0; i < len - turn; i++) {
				int currElement = arr[i];
				int nextElement = arr[i + 1];
				if(nextElement < currElement) {
					// swap these element
					int temp = currElement;
					arr[i] = nextElement;
					arr[i + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < len ; i++) {
			System.out.println(arr[i]);
		}
	}

}
