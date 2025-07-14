package Lecture8;

public class PostPreOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
//		System.out.println(i++); // 1
//		System.out.println(i); // 2
//		System.out.println(i++); // 2
//		System.out.println(i); // 3
//		System.out.println(i--); // 3
//		System.out.println(i); // 2
//		System.out.println(i--); // 2
//		System.out.println(i); // 1
//		System.out.println(i++); // 1
//		System.out.println(i); // 2
//		System.out.println(i--); // 2
//		System.out.println(i); // 1
		
		System.out.println(++i); // 2
		System.out.println(i); // 2
		System.out.println(++i); // 3
		System.out.println(i); // 3
		System.out.println(--i); // 2
		System.out.println(i); // 2
		System.out.println(--i); // 1
		System.out.println(i); // 1
		System.out.println(++i); // 2
		System.out.println(i); // 2
		System.out.println(--i); // 1
		System.out.println(i); // 1
	}

}
