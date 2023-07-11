package test;

public class Constants1 { //클래스 단어의 첫글자는 모두 대문자 MinValueNum
	public static void main(String[]args) {
		// 상수는 모두 대문자로 
		final int MIN_VALUE = 0; //MIN_VALUE_NUM 상수에서 단어 연결할 때에는 _ 사용
		final int MAX_VALUE = 100;
		//리터럴 (상수) : 자연어 : 문자, 문자열
		//			   자연수 : 정수, 실수
		//             논 리  : 참 , 거짓
		// 변수와 상수의 차이 : 수학에서의 차이
		// 리터럴과 상수의 차이
		// 상수 : 의미가 변하지 않는 수
		int I = 10;
		I = 20;
		final int II = 100; // final을 붙이면 다른 값을 대입할 수 없음. 상수가 되는 것.
		System.out.println(II);
		for ( int i = 0 ; i <= 100 ; i++) 
			System.out.println(i);
		for ( int i = 0 ; i <= 100 ; i++) 
			System.out.println(i);
		for ( int i = 0 ; i <= 100 ; i++) 
			System.out.println(i);
			//위 처럼 계속 반복될때 MIN_VALUE와 같이 미리 지정해놓고 반복해 놓으면 수정하기 용이
		
		int minValueNum; // 대문자 약속
		//권장하지 않음.				
		final int III;
		III= 1000;
		System.out.println(III);
		}
		
	}
	

