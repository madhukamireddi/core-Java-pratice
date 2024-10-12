import java.util.*;
public class QueueExample
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Queue <Integer> q = new  PriorityQueue<>();
	    for(int i = 0; i <5; i++)
	    {
	        q.offer(sc.nextInt());
	    }
	    System.out.println(q);
	    while(!q.isEmpty())
	    {
	        System.out.println(q.poll());
	    }
	
	}
}