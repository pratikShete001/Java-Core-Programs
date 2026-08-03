import java.io.*;
import java.util.*;

public class DataTypes_And_Limits {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int limit = sc.nextInt();
     
    for(int i=0; i<limit;i++)
    {
    try{
        long num = sc.nextLong();
        System.out.println(num+" can be fitted in:");
        if(num>= Short.MIN_VALUE && num< Short.MAX_VALUE)
        {
            System.out.println("* short");
        }
        if(num>= Integer.MIN_VALUE && num< Integer.MAX_VALUE)
        {
            System.out.println("* int");
        }
        if(num>=  Long.MIN_VALUE && num< Long.MAX_VALUE)
        {
            System.out.println("* long");
        }
        
    } 
    catch(Exception e){
        String s = sc.nextLine();
        System.out.println(s+" can't be fitted anywhere.");
    }
    }
    
    sc.close();
    }
}
