package test;

public class Implicitconversion1 {
	public static void main (String [] args) {
		//자동 형변환 : 작은크기가 큰 크기가 되는 것
		int i = 10;
		long l = i; // 4byte 짜리를 8 byte에 적용 = 자동 형 변환.
		double d = l;
		System.out.println(d);
		// byte < short 
		//         char < int < long < float < double
		//signed 는 unsigned가 될 수 있다.
		//정수는 실수가 될 수 있다.
		//강제 형변환
		short s = 32767;
		byte b = (byte)s;
		System.out.println(b);
		int ii1 = (int)10.5;
		System.out.println(ii1);
		
		double dNum= 1.2;
		float fNum= 0.9F;
		int result = (int)dNum + (int) fNum;
		System.out.println(result);
		result = (int)(dNum+fNum);
		System.out.println(result);
		
	}
}
