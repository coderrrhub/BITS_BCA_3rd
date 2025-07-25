package Lecture10;

public class CheckEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		checkEven(); // 10 is even
//		int a = 26;
//		checkEven(a); // 26 is even
//		int b = 20;
//		checkEven(b); // 20 is even
//		int c = 30;
//		checkEven(c); // 30 is even
//		
//		checkEven(); // 10 is even
		
//		System.out.println("Hello");
//		checkEven();
//		System.out.println("Bye");
		
		checkEven(); 
	}
	
	// 1st method
	static void checkEven(int n) {
		if(n % 2 == 0) {
			System.out.println(n +" is Even");
		}
	}
	
	 // 2nd Method
	 static void checkEven() {
		int n = 10;
		if(n % 2 == 0) {
			System.out.println(n +" is Even");
		}
		
		checkEven(n); // method calling
	}

}
