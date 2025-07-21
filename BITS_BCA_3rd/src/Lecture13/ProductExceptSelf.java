package Lecture13;

public class ProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		product(arr);
		
		// display the ans
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void product(int[] arr) {
		int[] leftProduct = new int[arr.length];
		int[] rightProduct = new int[arr.length];
		
		leftProduct[0] = 1;
		for(int i = 1; i < arr.length; i++) {
			leftProduct[i] = leftProduct[i-1] * arr[i-1];
		}
		
		rightProduct[arr.length-1] = 1;
		for(int i = arr.length-2; i >= 0; i--) {
			rightProduct[i] = rightProduct[i+1] * arr[i+1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = leftProduct[i] * rightProduct[i];
		}

	}
	
//	public static int[] product(int[] arr) {
//		int[] ans = new int[arr.length];
//		
//		for(int i = 0; i < ans.length; i++) {
//			int prod = 1;
//			for(int j = 0; j < arr.length; j++) {
//				if(j != i) {
//					prod = prod * arr[j];
//				}
//			}
//			
//			ans[i] = prod;
//		}
//		
//		// ans ---> each index pe product of all elements
//		return ans;
//	}
}
