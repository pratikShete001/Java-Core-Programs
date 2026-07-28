interface Area
	{
		double pi = 3.14;
		double calArea(double r);
	}
	
	class Circle implements Area
	{
		public double calArea(double r)
		{
			double circleArea = pi*r*r;
			return circleArea;
		}
	}
	
	class Square implements Area
	{
		public double calArea(double r)
		{
			double squareArea = r*r;
			return squareArea;
		}
	}
public class ExInterface
	{
		public static void main(String args[])
		{
			Circle c = new Circle();
			System.out.println("Area of circle is "+c.calArea(5.0));
			Square s = new Square();
			System.out.println("Area of circle is "+s.calArea(5.0));
			
		}
	}