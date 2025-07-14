package Lecture8;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b = (byte)128; // [-128,127] explicit type conversion 
//		System.out.println(b); // 128 ???
//		
//		byte c = (byte) 400;
//		System.out.println(c);
//		
//		byte d = (byte) 333;
//		System.out.println(d);
		
//		byte e = -5; // range 
//		System.out.println(e);
		
		
//		byte b = 12; // within the range implicit type conversion byte b = (byte)12;
//		byte c = 129;
		// Short range [-32768, 32767]
//		short s = 32767; // internally implicit type conversion short s = (short) 32767;
//		short t = 32768;
		
//		short s = (short)32769;
//		System.out.println(s);
		// int range [-2147483648, 2147483647];
//		int a = 2147483648;
//		long a = 2147483648l;
		
//		int a = (int)2147483648l;
//		System.out.println(a);
		
		char ch = 'a'; // Internally ASCII code (number ---> 97)
//		byte b = ch;
//		int b = ch;
		
//		 char ch1 = (char)(ch + 1); // explicitly 
		// ch++; i++ ---> i = i + 1 ---> ch = ch + 1
//		ch++; // internally ch = (char) ch + 1; implicitly
//		System.out.println(ch);
//		System.out.println(ch1);
//		byte e = (byte)-131;
//		System.out.println(e);
//		
//		byte b = (byte) 129;
//		System.out.println(b);
		
//		byte b = 126;
////		b = (byte)(b + 1); // explicity type conversion
//		b++; // b++; ---> b = (byte) b + 1;
//		System.out.println(b);
		
//		byte b = 127;
////		b = (byte)(b + 1); // explicity type conversion
//		b++; // b++; ---> b = (byte) b + 1; ---> 128
//		System.out.println(b);
		
//		boolean a = true; // false
		float a = 2.35f;
		float b = 5.00f;
		double c = 2347.090;
		double d = 12345.8764;
		 int f = (int)d;
		 System.out.print(f);
		
	}

}
