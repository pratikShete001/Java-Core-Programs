import java.util.Scanner;
class Account
{
	private int balance;
	Account(int balance)
	{
		this.balance = balance;
	}
	public boolean isSufficientBal(int w)
	{
		if(balance>=w)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	public void withdraw(int w)
	{
		balance = balance-w;
		System.out.println("Money Withdrawn");
		System.out.println("Current Balance is: "+balance);
	}
}
class Customer implements Runnable
{
	private String name;
	private Account g1;
	Customer(String s1,Account a1)
	{
		name = s1;
		g1 = a1;
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		synchronized(g1)
		{
			
			System.out.println(name+" Enter amount to withdrawn");
			int w = sc.nextInt();
			if(g1.isSufficientBal(w))
			{
				g1.withdraw(w);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
	}
}
public class Bank{
	public static void main(String args[]){
		Account a = new Account(10000);
		Customer c1 = new Customer("Pratik",a);
		Customer c2 = new Customer("Vishal",a);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}