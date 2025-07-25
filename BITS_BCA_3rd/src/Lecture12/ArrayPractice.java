package Lecture12;
import java.util.*;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int val = 4; // primitive
		Scanner sc = new Scanner(System.in);
//		System.out.println(arr.length);
		// how to store the data
		for(int pos = 0; pos < arr.length; pos++) {
			arr[pos] = sc.nextInt();
		}
//		System.out.println(arr);
//		System.out.println(arr.getClass().getName());
//		for(int pos = 0; pos < arr.length; pos++) {
//			System.out.println(arr[pos]);
//		}
		
		// in reverse order
		for(int pos = arr.length - 1; pos >= 0; pos--) {
			System.out.println(arr[pos]);
		}
	}

}
