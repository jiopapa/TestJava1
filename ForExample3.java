package loopexample;

import java.util.Scanner;

public class ForExample3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("시작 수를 입력해 주세요 : ");
		int startNum = sc.nextInt();
		System.out.print("마지막 수를 입력해 주세요 : ");
		int endNum = sc.nextInt();
		int sum = 0;
		for (int num = startNum; num <= endNum; num++) {
			sum = sum+ num;
		}
		System.out.println("sum = " + sum);
		
		
	}

}
