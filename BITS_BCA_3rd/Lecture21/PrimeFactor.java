package Lecture21;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		printAllFactors(n);
	}
	
	// O(square root(n))
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
//	public static boolean isPrime(int n) {
//		for(int i = 2; i < n; i++) {
//			if(n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
//	public static boolean isPrime(int n) {
//		int count = 0;
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0) {
//				count++;
//			}
//		}
//		
//		if(count == 2) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public static void printAllFactors(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				if(isPrime(i)) {
					System.out.print(i+"  ");
				}
			}
		}
	}

}
