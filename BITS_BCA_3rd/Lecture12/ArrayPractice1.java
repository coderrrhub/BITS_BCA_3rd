package Lecture12;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5]; // non primitive ---> data valid position ---> 0,1, size-1(4)
//		System.out.println(arr[0]);
//		int val; // default value ----> 0 // primitive
//		 val = val + 1;
//		System.out.println(val); // we have to initiable the primitive value before using it
//		int val; // variable declaration
//		System.out.println(val);
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 3;
		arr[3] = 12;
		arr[4] = 60;
//		arr[-1] = 32;  // Array index out of bound error
//		arr[5] = 61; // Array index out of bound error
		
		System.out.println(arr[0] +"  "+arr[4]); // 1 and 60
		// i want to swap the above 2 data 
		// arr[0] = 60 and arr[4] = 1
		swap(arr[0], arr[4]);
		System.out.println(arr[0] +"  "+arr[4]); // 60 and 1
		
		
//		char[] character = new char[5]; // char ----> default value ' '
//		System.out.println("abc"+"def"); // abcdef
//		System.out.println("abc"+character[0]+"def"); // abc def
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
