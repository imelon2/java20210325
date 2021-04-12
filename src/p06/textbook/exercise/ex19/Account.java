package p06.textbook.exercise.ex19;

public class Account {
	private int balance;
	
	public void setBalance(int balance) {
		if(balance < 0 || balance > 1_000_000) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
