interface BankAccount{
	void deposit(double amount);
	void withdraw(double amount);
	void getBalance();
}

class SavingsAccount implements BankAccount{
	double balance =0.0;
	public void deposit(double amount)
	{
		
		balance = balance + amount;
		System.out.println("Deposited "+amount+" in Savings Account.");
		
	}
	public void withdraw(double amount)
	{
		balance = balance-amount;
		System.out.println("Withdrawn "+amount+" from Savings Account.");
	}
	public void getBalance()
	{
		double interest = balance+(balance* 0.05);
		System.out.println("Saving Account Balance (with interest): " +interest);
	}
}

class CurrentAccount implements BankAccount{
	double balance = 0.0;
	final double overDraftLimit = 5000.0;
	public void deposit(double amount)
	{
		balance = balance+amount;
		System.out.println("Deposited "+amount+" in Current Account.");
	}
	public void withdraw(double amount)
	{
		balance = balance-amount;
		if(balance>= -overDraftLimit)
		{
			System.out.println("Withdrawn " + amount + " from Current Account.");
		}
		else{
			System.out.println("Withdrawal denied! Overdraft limit exceeded.");
		}
	}
	public void getBalance()
	{
		System.out.println("Current Account Balance is : " +balance);
	}
}

class BankInterface{
	public static void main(String args[])
	{
		BankAccount b;
		b = new SavingsAccount();
		b.deposit(10000);
		b.withdraw(2000);
		b.getBalance();
		
		b= new CurrentAccount();
		b.deposit(8000);
		b.withdraw(9000);
		b.getBalance();
	}
}
	
	