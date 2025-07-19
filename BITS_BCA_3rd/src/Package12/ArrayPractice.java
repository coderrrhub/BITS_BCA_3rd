package Package12;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 16, 7, 3, 25};
		int len = arr.length;
		System.out.println(arr[0] +"  "+arr[len-1]); // 5 and 25
		
		 int[] other = arr;
		 other[1] = 90;
		 System.out.println(arr[1]);
		 System.out.println(other[0] +"  "+other[len-1]); // 5 and 25
	}

}
