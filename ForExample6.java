package loopexample;

import java.util.Scanner;

public class ForExample6 {

	public static void main(String[] args) {
		
		
		//이중 반복문.
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 단을 입력해 주세요 : ");
		int startDan = sc.nextInt();
		System.out.print("끝낼 단을 입력해 주세요 : ");
		int endDan = sc.nextInt();
		System.out.print("시작할 곱을 입력해 주세요 : ");
		int startGop = sc.nextInt();
		System.out.print("끝낼 곱을 입력해 주세요 : ");
		int endGop = sc.nextInt();
		
				for ( int dan = startDan; dan <= endDan; dan++) {
			for( int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + (dan*gop));
			}
		}

	}

}