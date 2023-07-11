package test;

public class Integer1 {

	public static void main(String [] args) {
		byte b = -128; //1 byte
		System.out.println(b);
		b=127;
		System.out.println(b);
		short s = -32768; // 2 byte
		System.out.println(s);
		s = 32767;
		System.out.println(s);
		int i = -2147483648; // 4 byte : 정수 기본 크기
		System.out.println(i);
		i=2147483647;
		System.out.println(i);
		long l = 214748364700L; // 8 byte
		System.out.println(l);
		l = -214748364700L;
		System.out.println(l);
	}
	
}