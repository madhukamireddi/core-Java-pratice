/*How insert data into file */
import java.io.*;
class FileExample
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\abc.txt");
		if(f.createNewFile())
		{
			System.out.println("file created");
		}
		FileWriter fw = new FileWriter(f,true);
		fw.write("Hello welcome to my world");
		fw.close();

	}
}