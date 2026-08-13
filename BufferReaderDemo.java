import java.io.*;
class BufferReaderDemo{
	public static void main(String args[]) throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader("example.txt"));
		String s;
		while((s = file.readLine()) != null)
		{
		System.out.println(s);
		}
		file.close();
	}
}