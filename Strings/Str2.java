/*2.Write a Program to print the alternative vowels in a given string? */
import java.util.*;
public class Str2
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s =sc.nextLine().toLowerCase();
	    int count = 0;
	    for(int i = 0; i <s.length(); i++)
	    {
	        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) =='o' || s.charAt(i) == 'u')
	        {
	            count++;
	            if(count%2==1)
	            {
	                System.out.print(s.charAt(i)+" ");
	            }
	        }
	    }
	}
}