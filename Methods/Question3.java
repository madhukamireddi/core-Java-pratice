/*
create a java application where we have a java class it contains 
a non-static variable and a non-static method m1 having string 
as parameter and returns int type of value and a static method m2 
having float as parameter and returns short then invoke all of the 
properties under main method by providing dynamic inputs
*/

import java.util.Scanner;
class Question3
{
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
   int m1(String a)
   {
       System.out.println(a);
       return sc.nextInt();
   }
   static short m2(float a)
   {
       System.out.println(a);
       return sc.nextShort();
   }
	public static void main(String[] args) 
	{
	   Question3 obj= new Question3();
	    System.out.println(obj.m1(sc.next()));
	    System.out.println(m2(sc.nextFloat()));
	}
}