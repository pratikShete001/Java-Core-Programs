
class Student_Grades
{
	String name;
	int math, science, history, avg_marks,roll_number;
	
	
		Student_Grades(String name, int roll_number, int math, int science, int history)
		{
			if(math<0 || science < 0 || history < 0)
			{
				throw new ArithmeticException("Plz enter valid marks");
			}
			this.name = name;
			this.roll_number = roll_number;
			this.math = math;
			this.science = science;
			this.history = history;
			avg_marks = (math + science + history) / 3;
			
		}
	
	
	
	public int Grades()
	{
		if(math<0 || science < 0 || history < 0)
		{
			System.out.println("plz enter valid marks");
			return 0;
		}
		if (avg_marks >= 75)
		{
			System.out.println(name+ " You got Distinction");
		}
		else if (avg_marks >= 60 && avg_marks < 75)
		{
			System.out.println(name +" You got First Class");
		}
		else if (avg_marks >= 50 && avg_marks < 60)
		{
			System.out.println(name +" You got Second Class");
		}
		else{
			System.out.println(name+ " you are Fail");
		}
		return 0;
	}

	public static void main(String args[])
	{
		try
		{
			Student_Grades student1 = new Student_Grades("Pratik", 1, 56,66,77);
			student1.Grades();
			Student_Grades student2 = new Student_Grades("Vishal", 2, -66,78,99);
			student2.Grades();
			Student_Grades student3 = new Student_Grades("Om",3,2,9,6);
			student3.Grades();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}