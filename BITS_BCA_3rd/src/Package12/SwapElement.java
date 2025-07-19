package Package12;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16,5,6,21,90};
		int len = arr.length;
		System.out.println(arr[0]+" Outside Above "+arr[len-1]); // 16 and 90
//		swap(arr[0],arr[len-1]); call by vaue
		swap(arr, 0, len - 1); // call by reference
		System.out.println(arr[0]+" Outside "+arr[len-1]); // 90 & 16
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		// a and b changes only reflect over here ---> call  by value
	}
	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i]+" Inside before "+arr[j]); // 16 and 90
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i]+" Inside After "+arr[j]); // 90 and 16
	}

}
