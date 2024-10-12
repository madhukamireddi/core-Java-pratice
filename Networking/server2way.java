import java.net.*;
import java.io.*;
import java.util.*;
class Server
{
	public static void main(String[]args)throws IOException
	{
		ServerSocket ss=new ServerSocket(7777);
		
		Socket s=ss.accept();
		Scanner sc=new Scanner(System.in);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		
		String s1=" ",s2="";
		while(!s1.equals("stop")){
			s1=dis.readUTF();
			System.out.println("Client : "+s1);
			System.out.print("server : ");
			s2=sc.nextLine();
			dos.writeUTF(s2);
			dos.flush();
		}
		dos.close();		
		dis.close();
	}
}
		