/*adding data  and reading in different files at a single time*/
import java.io.*;
public class FileExample5
{
	public static void main(String[] args) throws IOException
	{
	    	File f1= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\sanjay.txt");
		File f2= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\hasan.txt");
		File f3= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\chaitu.txt");

		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();

		FileOutputStream fos1 = new FileOutputStream(f1);
		FileOutputStream fos2 = new FileOutputStream(f2);
		FileOutputStream fos3 = new FileOutputStream(f3);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();


	    String k ="Madhu kamireddi";
	    byte arr []  = k.getBytes();
	    bos.write(arr);
		bos.writeTo(fos1);
		bos.writeTo(fos2);
		bos.writeTo(fos3);
	    bos.flush();
	    bos.close();

		FileInputStream fis1 = new FileInputStream(f1);
		FileInputStream fis2 = new FileInputStream(f2);
		FileInputStream fis3 = new FileInputStream(f3);

		SequenceInputStream sis= new SequenceInputStream(fis1,fis2);
		int i = 0;
		while((i=sis.read())!=-1)
		{
			System.out.println((char)i);
		}
		sis.close();

		
	}
}