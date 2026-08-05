import java.util.Scanner;
public class BankAccount
{
	static Scanner sc = new Scanner(System.in);
	static boolean isRunning = true;
	static double balance = 10000;

	public static void main(String args[])
	{
		
		while(isRunning)
		{
			System.out.println("BANKING PROGRAM");
			System.out.println("*****************");
			System.out.println("1. Show Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("*****************");

			System.out.println("Enter you choice(1-4): ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 -> showBalance();
			case 2 -> deposit();
			case 3 -> withdraw();
			case 4 -> exit();
			default -> System.out.println("Invalid Choice");
			}  
		}
	}
		static void showBalance()
		{
			System.out.printf("$%.2f \n",balance);
		}
		static void deposit()
		{
			System.out.println("Enter amount to deposit");
			double amount = sc.nextDouble();
			if(amount < 0)
			{
				System.out.println("Amount can't be negative");
			}
			else
			{
				System.out.println("Amount deposited");
				balance =+amount;
			}
		}
		static void withdraw()
		{
			System.out.println("Enter amount to withdraw");
			double withdraw = sc.nextDouble();
			balance =- withdraw;
		}
		static void exit()
		{
			isRunning = false;
		}
		
	}
/* Learnings
1) Static method can call directly access anywhere
2) we can create switch statement case 1 -> method(); like thak way
3) printf is method use for format .2 is for print 2 decimals after point
4) we can make scanner class static to access everywhere
5) 