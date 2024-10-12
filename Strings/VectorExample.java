
import java.util.*;
public class VectorExample
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Vector <Integer> vc = new Vector<>();
	    for(int i = 0; i <5; i++)
	    {
	        vc.add(sc.nextInt());
	    }
	    Enumeration <Integer> e = vc.elements();
	    while(e.hasMoreElements())
	    {
	        System.out.println(e.nextElement());
	    }
		
	}
}