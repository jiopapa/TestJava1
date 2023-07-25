package account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Map<String, Account> map = new HashMap<String, Account>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("계좌번호 : 1 | 입금 : 2 | 출금 : 3 | 계좌출력 : 4 | 종료 : 5 ");
			System.out.println("해당 번호를 입력해 주세요 : ");
			String num = sc.nextLine();

			switch (num) {
			case "1":
				System.out.println("계좌번호 등록");
				System.out.print("계좌번호를 입력해 주세요. : ");
				String accNumb = sc.nextLine();
				System.out.print("계좌주를 입력해 주세요. : ");
				String accName = sc.nextLine();
				System.out.print("금액을 입력해 주세요. : ");
				int money = Integer.parseInt(sc.nextLine());
				Account acc = new Account(accNumb, accName, money);
				map.put(accNumb, acc);
				break;
			case "2":
				System.out.println("입금");
				System.out.print("계좌번호를 입력해 주세요. : ");
				accNumb = sc.nextLine();
				acc = map.get(accNumb);
				System.out.print("금액을 입력해 주세요. : ");
				money = Integer.parseInt(sc.nextLine());
				acc.balance += money;
				break;
			case "3":
				System.out.println("출금");
				System.out.print("계좌번호를 입력해 주세요. : ");
				accNumb = sc.nextLine();
				acc = map.get(accNumb);
				System.out.print("금액을 입력해 주세요. : ");
				money = Integer.parseInt(sc.nextLine());
				acc.balance -= money;
				break;
			case "4":
				System.out.println("계좌 정보");
				System.out.print("계좌번호를 입력해 주세요. : ");
				accNumb = sc.nextLine();
				System.out.println("계좌번호\t계좌주\t잔액");
				acc = map.get(accNumb);
				if (acc ==null)
				System.out.println("해당 계좌가 존재하지 않습니다.");
				System.out.println(acc.getAccNumb()+"\t"+acc.getAccName()+"\t"+acc.getBalance());
				break;
			case "5":
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}

	}
}
