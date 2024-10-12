/*
create a java application where we have a java class it contains 
a non-static variable and two static variables and a non-static 
method m1 having parameter and return type and a static method m2 
having parameters and return type and another static method m3 having 
parameter and return type then invoke all of these methods under 
main method by providing dynamic inputs
*/

import java.util.Scanner;
class Question7
{
    static Scanner sc = new Scanner(System.in);
    String s = sc.next();
    static int a = sc.nextInt();
    static char b = sc.next().charAt(0);
   boolean m1(long a)
   {
       System.out.println(a);
       return sc.nextBoolean();
   }
   static int m2(String a)
   {
       System.out.println(a);
       return sc.nextInt();
   }
   static float m3(short a)
   {
       System.out.println(a);
       return sc.nextFloat();
   }
	public static void main(String[] args) 
	{
	   Question7 obj= new Question7();
	   System.out.println(obj.m1(sc.nextLong()));
	   System.out.println(m2(sc.next()));
	   System.out.println(m3(sc.nextShort()));

	}
}

/*

Output:
101
a
madhu
123456789
123456789
flase
false
kiran
kiran
201
201
10
10
12.12
12.12

*/