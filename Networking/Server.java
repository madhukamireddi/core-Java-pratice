import java.net.*;
import java.io.*;
import java.util.*;
class Server
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(1111);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println("Client : "+dis.readUTF());
	s.close();
	ss.close();
/*
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF(sc.next());
		dos.flush();
		dos.close();
*/
	}
}