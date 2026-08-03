import java.lang.*;

public class Methods_of_Integer 
{

    public static void main(String[] args) 
	{
		
      String s = "123";
	  int num = 5;
	  
	  int parse_int = Integer.parseInt(s); 
	  Integer obj = Integer.valueOf(num);
	  String num_string = Integer.toString(num);
	  int int_num = obj.intValue();
	  
	  System.out.println(Integer.compare(int_num,parse_int)); // O/p -> -1 because int_num < parse_int 
	  System.out.println(Integer.max( int_num, parse_int));
	  System.out.println(Integer.min( int_num, parse_int));
	  System.out.println(Integer.sum( int_num, parse_int));
	  System.out.println(Integer.toBinaryString(int_num));
	  System.out.println(Integer.toOctalString(int_num));
	  System.out.println(Integer.toHexString(int_num));
	  
    }
}

//  All the methods of Wrapper class are static so call them with static keyword
// pass the variable inside this method without identifire
// valueOf() method convert primitive datatypes such as int,float,double,long into Wrapper class
// intValue() method convert wrapper class object into primitive value obj.intvalue();
// Wrapper class inside java.lang package;


