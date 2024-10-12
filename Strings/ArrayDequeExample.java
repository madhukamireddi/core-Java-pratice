//crate  java application where we need to create ArrayDeque  and then add queue values to it then print the queue //in both stack and queue order

import java.util.*;
public class ArrayDequeExample
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayDeque <Integer> q = new  ArrayDeque<>();
	    //implementing qeue
	   // for(int i = 0; i <5; i++)
	   // {
	   //     q.addFirst(sc.nextInt());
	   // }
	   // System.out.println(q);
	   // while(!q.isEmpty())
	   // {
	   //     System.out.println(q.removeLast());
	   // }
	     for(int i = 0; i <5; i++)
	    {
	        q.addFirst(sc.nextInt());
	    }
	    System.out.println(q);
	    while(!q.isEmpty())
	    {
	        System.out.println(q.removeFirst());
	    }
	
	}
}