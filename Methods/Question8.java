/*
create a java application where we have a java class it contains 
two static variables and two non-static variables and two non-static
methods having no parameter and returns nothing then print all of
the global variables in both the methods and invoke these methods under
main method by using two different objects
*/

import java.util.Scanner;
class Question8
{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static char b = sc.next().charAt(0);
    String c = sc.next();
    float d = sc.nextFloat();
   void m1()
   {
       
       System.out.println(a+" "+b+" "+c+" "+d);
   }
   void m2()
   {
       System.out.println(a+" "+b+" "+c+" "+d);
   }
   
	public static void main(String[] args) 
	{
	   Question8 obj1 = new Question8();
	   Question8 obj2 = new Question8();
	   obj1.m1();
	   obj2.m2();


	}
}

/*
output:
101
a
madhu
12.11
kiran
12.22
101 a madhu 12.11
101 a kiran 12.22
*/