/*7.	Write a Program to print the all the index’s of a  given character in a given string?*/
import java.util.*;
public class Str7
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine();
	    char ch = sc.next().charAt(0);
	    for(int i = 0; i < s.length(); i++)
	    {
	        if(s.charAt(i)==ch)
	        {
	            System.out.println(i);
	        }
	    }
	   // by using predefined method
	   // System.out.println(s.indexOf(ch));
	}
}