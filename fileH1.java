import java.io.*;
class FileH1{
	public static void main(String args[]) throws IOException
	{
		File f = new File("abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.length());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
	}
}