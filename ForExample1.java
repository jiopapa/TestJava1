package loopexample;

import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요 : ");
		int dan = sc.nextInt();
		System.out.print("시작할 곱을 입력해 주세요 : ");
		int startGop = sc.nextInt();
		System.out.print("끝낼 곱을 입력해 주세요 : ");
		int endGop = sc.nextInt();
		for(int gop = startGop; gop <= endGop; gop++ ) {
			
			System.out.println(dan + " * " + gop  + "= " + dan * gop);
		}
	}

}
