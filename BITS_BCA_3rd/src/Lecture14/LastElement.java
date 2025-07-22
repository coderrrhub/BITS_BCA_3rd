package Lecture14;

public class LastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,7,8,9,11,6};
		int len = arr.length;
		correctLastElement(arr);
		
		for(int i = 0; i < len ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void correctLastElement(int[] arr) {
		int len = arr.length;
		int temp = arr[len - 1];
		int start = len - 2;
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
