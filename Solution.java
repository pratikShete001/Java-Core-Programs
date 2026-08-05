/* Algorithm

try{
	take account balance from user
	take withdrawal amount from user
	if withdrawal amount is not integer throw InputmismatchException
	if withdrawl amount not sufficient then throw Insufficient Exception
	if withdrawal amount is negative then throw IllegalArgumentException
	3 catch block to handle 3 exception 
	and print Transaction complete in finally block
*/
import java.util.*;
class InSufficientBalanceException extends Exception
{
	public InSufficientBalanceException(String msg)
	{
		super(msg);
	}
}
public class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter Bank Balance: ");
			int balance = sc.nextInt();
			System.out.println("How many ruppes you want to withdraw");
			int withdraw = sc.nextInt();
			if(withdraw<0)
			{
				throw new IllegalArgumentException("withdrawal amount cannot be negative");
			}
			if(withdraw<balance)
			{
				throw new InSufficientBalanceException("Insufficient Balance");
			}
			balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
			
		}
		catch(InputMismatchException e)
		{
			e.getMessage();
		}
		catch(IllegalArgumentException e)
		{
			e.getMessage();
		}
		catch(InSufficientBalanceException e)
		{
			e.getMessage();
		}
		finally
		{
			System.out.println("Transaction Complete");
		}
		sc.close();
	}
}
	