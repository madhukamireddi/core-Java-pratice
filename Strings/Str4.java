/*4.Write a Program to print the ASCII key values of a given String characters?*/
import java.util.*;
public class Str4
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine();
	    for(int i = 0; i < s.length(); i++)
	    {
	        int a = (int)s.charAt(i);
	        System.out.print(a+" ");
	    }
	}
}