/*Reading data from file*/
import java.io.*;
class FileExample2
{
	public static void main(String [] args) throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String s ="";
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();
	}

}