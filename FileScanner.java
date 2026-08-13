import java.io.*;
import java.util.*;

class FileScanner
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("example.txt");
		Scanner sc = new Scanner(f);
		
		String s;
		while((s = sc.nextLine()) !=null)
		{
		System.out.println(s);
		}
		
	}
}