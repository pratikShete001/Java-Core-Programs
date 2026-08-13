import java.io.*;
class FileWriterDemo{
	public static void main(String args[]) throws IOException
	{
		FileWriter file = new FileWriter("example.txt",true);
		String s1 = "pratik Dattatray Shete";
		file.write(s1);
		file.close();
	}

}