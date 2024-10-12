/*Reading data from file by Scanner class*/
import java.util.*;
import java.io.*;
class FileExample3
{
	public static void main(String [] args) throws Exception
	{
		File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\abc.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine())	
		{
			System.out.println(sc.nextLine());
		}
		sc.close();	
	}

}