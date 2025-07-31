package Lecture20;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  Hello         World     Bye ";
		String[] arr = s.split(" "); // regex
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
//		System.out.println(s.trim()+"Bye");
	}

}
