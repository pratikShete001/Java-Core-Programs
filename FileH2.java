import java.io.*;
class FileH2{
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("abc.txt");
		int ch = file.read();
		char character = (char)ch;
		System.out.println(character);
		
	}
}