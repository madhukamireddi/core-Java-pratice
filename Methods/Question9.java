/*
create a java application where we have a java class it contains 
a non-static method m1 having float,int as parameters and retuns
nothing and a static method m2 having char,String as parameters
and returns String then invoke m1 under m2 and m2 under main methods
*/

import java.util.Scanner;
class Question9
{
    static Scanner sc = new Scanner(System.in);
   void m1(float a,int b)
   {
       System.out.println(a+" "+b);
   }
   static String m2(char a,String b)
   {
       System.out.println(a+" "+b);
       Question9 obj = new Question9();
       obj.m1(sc.nextFloat(),sc.nextInt());
       return sc.next();
       
   }
   
	public static void main(String[] args) 
	{
	  System.out.println(m2(sc.next().charAt(0),sc.next()));;
	}
}

/*
output:
a
madhu
a madhu
12.11
101
12.11 101
kiran
kiran
*/