package test;

import java.util.Scanner;

public class Variable2 {
	
	public static void main(String [] args) {
		int i = 10;
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요.");
		System.out.println(sc.nextInt()+sc.nextInt());
		//int 자료형 (정수)
		int j ; // 변수 선언
		// 변수명 = 값 
		j=20 ; // 대입
		System.out.println(j);		
		//
		int z;
		//변수명 = 값
		z = i ;
		System.out.println(z+i);
		i = j ;
		System.out.println(i);
		System.out.println(z+i);
		int y = 40; // 초기화
		int $a;
		int _a;
		//int int 불가 = 예약어로 변수명을 지을 수 없음.
	
	}
	
	
	
	

}
