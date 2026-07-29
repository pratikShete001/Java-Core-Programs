import java.lang.*;
interface Shape
{
	double area();
	double perimeter();
}

class Circle implements Shape{
	final double pi = 3.142;
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
		public double area(){
			return pi*radius*radius;
		}
		public double perimeter(){
			return 2*pi*radius;
		}
	
}


class Rectangle implements Shape{
	double length;
	double breadth;
	Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
		public double area(){
			return  length * breadth;
		}
		public double perimeter(){
			return 2 * (length + breadth);
		}
	
}
class Triangle implements Shape{
	double a,b,c;
	Triangle(double a, double b, double c)
	{
		this.a =a;
		this.b =b;
		this.c =c;
	}
		public double area(){
			double s = (a+b+c)/2;
			return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		public double perimeter(){
			return a+b+c;
		}
	
}

class Area_Perimeter{
	public static void main(String args[])
	{
		Shape s1;
		s1 = new Circle(5.0);
		System.out.println("Cricle: Area "+s1.area()+", Perimeter = "+s1.perimeter());
		s1 = new Rectangle(5.0,3.0);
		System.out.println("Rectangle : Area "+s1.area()+", Perimeter = "+s1.perimeter());
		s1 = new Triangle(5.0,4.0,3.0);
		System.out.println("Triangle: Area "+s1.area()+", Perimeter = "+s1.perimeter());
		
	}
}