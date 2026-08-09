import java.io.*;
import java.util.*;

public class Demo_Exception {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      try{
        
        int b = sc.nextInt();
        int h = sc.nextInt();
        if(b<=0 || h<=0)
        {
            throw new ArithmeticException("java.lang.Exception: Breadth and height must be positive");
        }
        int a = b*h;
        System.out.println(a);
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
     sc.close();
    }
}
