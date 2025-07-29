package Lecture18;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis(); // millisecond
		for(int i = 0; i < 100000; i++) {
			// just do nothing
			// i =0,1,2,3...10000
		}
		long end = System.currentTimeMillis(); // millisecond
		System.out.println(end-start); // actual time to run this particular code
		
		
		System.out.println("Hello"); // this is constant time
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
