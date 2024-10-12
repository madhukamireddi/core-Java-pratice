/*
create a java application where we have a java class it contains 
a non-static method m1 having long as parameter and returns nothing
and another non-static method m2 having string,float,boolean 
as parameters and returns integer value and a static method m3 having
short as parameter and returns character then invoke these methods
in the main method by providing dynamic inputs 
*/

import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
   void m1(long a)
   {
       System.out.println(a);
   }
    int m2(String a,float b,boolean c)
   {
       System.out.println(a+" "+b+" "+c);
       return sc.nextInt();
   }
   static char m3(short a)
   {
       System.out.println(a);
       return sc.next().charAt(0);
   }
	public static void main(String[] args) 
	{
	   Question5 obj= new Question5();
	    obj.m1(sc.nextLong());
	    System.out.println(obj.m2(sc.next(),sc.nextFloat(),sc.nextBoolean()));
	    System.out.println(m3(sc.nextShort()));

	}
}