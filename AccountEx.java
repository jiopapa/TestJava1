package practice23072501;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Practice230725.Account;

public class AccountEx {
	public static void main(String[] args) {
		String accNum;
		String accName;
		int money;
		Map<String, Account> map = new HashMap<String, Account>();
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌정보 : 4 | 종료 : 5 ");
		System.out.print("원하는 메뉴의 번호를 입력해주세요. : ");
		String num = sc.nextLine();
		
		switch(num) {
		case "1" : 
			System.out.println("계좌등록");
			System.out.println("계좌번호를 입력해 주세요.");
			accNum = sc.nextLine();
			System.out.println("계좌주를 입력해 주세요.");
			accName = sc.nextLine();
			System.out.println("초기 입금액을 입력해 주세요.");
			money = Integer.parseInt(sc.nextLine());
			Account acc = new Account(accNum, accName, money);
			map.put(accNum, acc);
			break;
			
		case "2" : 
			System.out.println("입금메뉴입니다.");
			System.out.println("입금할 계좌번호를 입력해 주세요.");
			accNum = sc.nextLine();
			
		case "3" : 
			System.out.println("출금");
			
		case "4" : 
			System.out.println("계좌정보");
			
		case "5" : 
			System.out.println("종료되었습니다");
			System.exit(0);
			break;
			
		}
	}
}
