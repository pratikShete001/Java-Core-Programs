interface A
{
	void funa();
	default void func()
	{
		System.out.println("I am Function c");
	}
}
interface B
{
	void funb();
	default void func()
	{
		System.out.println("I am Function c");
	}
}
class X implements A,B

{
	public void func()
	{
		System.out.println("I am function d");
	}
	public void funa()
	{
		System.out.println("Good Morning");
	}
	public void funb()
	{
		System.out.println("Good evening");
	}
}
public class DemoInterface
{
	public static void main(String args[])
	{
		X x1 = new X();
		x1.funa();
		x1.funb();
		x1.func();
	}
	
}