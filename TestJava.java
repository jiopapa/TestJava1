package test;

public class TestJava {

	public static void main(String[] args) {
		System.out.println("1 : 리스트 | 2 : 검색 | 3: 수정");
			//리터럴 : 자연어 : 한글, 일어, 영어,...,
		//					문자 : 한글자 (김, a)
		//					문자열 : 한글자 이상(김, 김이, a, ab)
//					 자연수 : 정수 : 10 , 5
//							실수 : 10.2 , 0.5
		//		
		int i = 15;
		int j = 5; //변수 선언 + 대입 = 초기화
		int ij; //ij는 정수만 저장할께요; 변수 선언
		ij = 100; // 대입
		System.out.println(i + ij);
		ij = 200; // 대입 ( 나중에 대입한 값만 남음.)
		System.out.println(i + ij);
		byte b = 127;
		System.out.println(b);
		b = -128;
		System.out.println(b);
		short s = 32000;
		s = -32000;
		i = 2100000000;
		long l = 2100000000l;
	//  byte < short < char < int (약 21억) < long 소문자 대문자 상관없이 L을 써야함.
		// char는 문자를 대입하는 변수로 사용.
		char ch = 88; // 크기는 short하고 동일.
		System.out.println(ch);
		ch = 120; // 
		System.out.println(ch);
		
		int ii = 100;
		int i1 = ii;
		System.out.println(i1);
		
		char iii='i'; // i라고 적으면 int i = 15인 15를 사용할지 i를 의미하는 69를 의미하는지 모르니 'i'로 사용. 
		System.out.println(iii);
		
		int age = 5;
		System.out.println(age);
		
		int year = 2018; //int형 변수 year에 값 2018을 대입한다.
		System.out.println(year);
		
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력
		System.out.println((int)ch1); //A에 해당하는 정수 값 (아스키코드) 출력
	}

}
