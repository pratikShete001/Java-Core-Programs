import java.io.*;
class FileH3{
	public static void main(String args[]) throws IOException
	{
		FileWriter file = new FileWriter("abc.txt",true);
		
		String s = "pratik shete";
		file.write(s);
		System.out.println("OK");
		
	}
}