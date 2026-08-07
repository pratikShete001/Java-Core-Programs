interface Calculation{
	int a = 30;
	int b = 20;
	void add();
	void substraction();
}
class Calculator implements Calculation{
	public void add(){
		System.out.println("Addition of number a and b is "+(a+b));
	}
	public void substraction(){
		System.out.println("Substraction of number a and b is "+(a-b));
	}
}
class Main
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		c.add();
		c.substraction();
	}
}