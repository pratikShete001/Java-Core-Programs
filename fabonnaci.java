import java.util.Scanner;
class fabonnaci{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int range = sc.nextInt();
		int a=-1, b = 1,c;
		for(int i = 0; i<= range; i++)
		{
			c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}
