import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) throws IOException
	{
		Socket s=new Socket("Localhost",7777);

		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		DataInputStream dis=new DataInputStream(s.getInputStream());	
		
		Scanner sc=new Scanner(System.in);
		
		String s1="", s2="";
		while(!s1.equals("stop")){
				System.out.print("client : ");
				s1=sc.nextLine();
				dos.writeUTF(s1);
				dos.flush();
				s2=dis.readUTF();
			System.out.print("client : "+dis.readUTF());
		}
						
		dis.close();
		dos.close();

	}
}