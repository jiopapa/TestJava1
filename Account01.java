package practice23072501;

public class Account01 {
	String accNum;
	String accName;
	Integer balance;

	public Account01(String accNum, String accName, Integer balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;

	}
	public void setAccNum() {
		this.accNum = accNum;
	}
	public void setAccName() {
		this.accName = accName;
		
	}
	public void setBalance() {
		this.balance = balance;
	}
	public String getAccNum() {
		return accNum;
	}
	public String getAccName() {
		return accName;
	}
	public Integer getBalance() {
		return balance;
	}
}
