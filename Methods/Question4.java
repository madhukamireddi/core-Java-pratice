/*
create a java application where we have a java class it contains 
a non-static method having float as parameter and returns String
type of value and another non-static method m2 having int,boolean
as parameter and return nothing then invoke these methods under main
method by providing dynamic inputs
*/

import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
   String m1(float a)
   {
       System.out.println(a);
       return sc.next();
   }
    void m2(int a, boolean b)
   {
       System.out.println(a+" "+b);
   }
	public static void main(String[] args) 
	{
	   Question4 obj= new Question4();
	   System.out.println(obj.m1(sc.nextFloat()));
	   obj.m2(sc.nextInt(),sc.nextBoolean());

	}
}