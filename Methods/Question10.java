/*
create a java application where we have a java class it contains 
three non-static methods have m1,m2,m3 having parameter and return 
type then invoke m1 under m2, m2 under m3 and m3 under main methods
*/

import java.util.Scanner;
class Question10
{
    static Scanner sc = new Scanner(System.in);
   
   char m1(int a)
   {
       System.out.println(a);
       return sc.next().charAt(0);
   }
   String m2(char a)
   {
       System.out.println(a);
       System.out.println(m1(sc.nextInt()));
       return sc.next();
   }
   float m3(boolean a)
   {
       System.out.println(a);
       System.out.println(m2(sc.next().charAt(0)));
       return sc.nextFloat();
   }
	public static void main(String[] args) 
	{
	   Question10 obj = new Question10();
	  System.out.println(obj.m3(sc.nextBoolean()));;
	}
}

/*
output:
true
true
a
a
101
101
b
b
naveen
naveen
12.11
12.11
*/