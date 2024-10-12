/*3.	Write a program to print the biggest / longest word in a given String? */
import java.util.*;
public class Str3
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine();
	    String [] str = s.split(" ");
	    int maxWord = Integer.MIN_VALUE;
	    String s1 = "";
	    for(int i = 0; i < str.length; i++)
	    {
	        if(maxWord < str[i].length())
	        {
	            maxWord = str[i].length();
	            s1 = str[i];
	        }
	    }
	    System.out.println(s1);
	   
	}
}