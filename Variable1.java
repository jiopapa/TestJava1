package test;

import java.util.Scanner;

public class Variable1 {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println(10 + 20);
		//API ( Application interface) = Scanner 같은 도구들
	
		Scanner  sc = new Scanner(System.in);
		//Ctrl + Shift + O  = import java.util.Scanner 생성됨.
		System.out.print("정수를 입력해 주세요 : "); 
		//println X print O
		int i = sc.nextInt();

		System.out.print("정수를 입력해 주세요 : ");
		int j = sc.nextInt();
				
		System.out.println(i+j);
	}

}
