import java.io.*;

public class BufferExample{
	public static void main(String args[]) throws IOException
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
		writer.write("Hello, Pratik!");
		writer.newLine();
		writer.write("This is demo of BufferedWriter and BufferedReader");
		writer.newLine();
		writer.write("Data written to file Successfully!");
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
		String s;
		
		while((s = reader.readLine()) != null)
		{
		System.out.println(s);
		}
		reader.close();
	}
}