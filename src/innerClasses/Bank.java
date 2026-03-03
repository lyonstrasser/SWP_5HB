package innerClasses;

public class Bank {
	
	private double balance;
	
	public Bank (double balance) {
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println(this.balance);
	}
	
	public class Account {
		public void deposit(double amount) {
			Bank.this.balance += amount;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(10000);
		Account a = b.new Account();
		
		b.showBalance();
		a.deposit(500);
		b.showBalance();
	}

}
