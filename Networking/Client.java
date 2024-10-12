import java.net.*;
import java.io.*;
import java.util.*;
class Client
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) throws IOException
	{
		Socket s = new Socket("localhost",8888);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF(sc.next());
		dos.flush();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println("Client : "+dis.readUTF());
		
	}
}