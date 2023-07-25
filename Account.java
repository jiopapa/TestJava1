package account;

////이름 , 계좌번호 , 잔액 
public class Account {
	String accName;
	String accNumb;
	int balance;
	
	
	
	
	
	
	public Account(String accName, String accNumb, int balance) {
		super();
		this.accName = accName;
		this.accNumb = accNumb;
		this.balance = balance;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNumb() {
		return accNumb;
	}
	public void setAccNumb(String accNumb) {
		this.accNumb = accNumb;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}






