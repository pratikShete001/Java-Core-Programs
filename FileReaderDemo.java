import java.io.*;
class FileReaderDemo{
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("abc.txt");
		int ch;// filereader return ascie value of the character inside file
		ch = file.read();
		System.out.println((char)ch); // convert interger ASCII value ch into char
	}

}