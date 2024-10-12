/*6.Write a Program to print the last index of a given character in a given string?*/
import java.util.*;
public class Str6
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine();
	    char ch = sc.next().charAt(0);
	    for(int i =s.length()-1; i >=0; i--)
	    {
	        if(s.charAt(i)==ch)
	        {
	            System.out.println(i);
	            break;
	        }
	    }
	   // by using predefined method
	    System.out.println(s.lastIndexOf(ch));
	}
}