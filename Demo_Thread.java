class NumberPrinter extends Thread
{
	String threadName;
	NumberPrinter(String name)
	{
		this.threadName = name;
	}
	
	public void run()
	{
		for(int i =1; i<=100; i++)
		{
			System.out.println(threadName+" prints "+i);
		}
	}
}
public class Demo_Thread
{
	public static void main(String args[])
	{
		NumberPrinter n1 = new NumberPrinter("Thread-1");
		NumberPrinter n2 = new NumberPrinter("Thread-2");
		n1.start();
		n2.start();
	}
}
	