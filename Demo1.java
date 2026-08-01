/*
INPUT
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
*/
/*
OUTPUT
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/
import java.util.Scanner;
public class Demo1{
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("How many test cases you want to run");
	int t = sc.nextInt();
	for(int i=0; i<=t;i++)
	{
		try{
		long num = sc.nextLong();
		System.out.println(num+" can be fitted in:");
		if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
		{
			System.out.println("* short");
		}
		if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
		{
			System.out.println("* int");
		}
		if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
		{
			System.out.println("* long");
		}
		}
		catch(Exception e){
			
			System.out.println(sc.next()+" can't be fitted anywhere");
		}
		
	}
	}
}