import java.io.*;

class BufferWriterDemo{
	public static void main(String args[]) throws IOException
	{
		BufferedWriter file = new BufferedWriter(new FileWriter("example.txt"));
		file.write("pratik shete");
		file.newLine();
		file.write("pratik shete");
		file.newLine();
		file.write("pratik shete");
		file.newLine();
		file.close();
	}
}
		