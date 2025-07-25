package Lecture11;

public class FunctionPractice {
	// Global ---> m
	 static int m = 50; //Global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a = 12; // local variable
		System.out.println(m); // 50
		System.out.println(a); // 12

		func(n);
		// local variable ---> a & n
	}
	
	 static void func(int n) {		 
		 System.out.println(m); // 50
		 int m = 201;
		 // local variable ---> n & m
		n = n + 10; // n = 10 + 10 = 20
		System.out.println(m); // 201
	}
}
