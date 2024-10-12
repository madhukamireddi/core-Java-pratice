/*
create a java application where we have a java class it contains 
a static variable and a non-static variable and two non-static
methods having parameters and returns nothing then invoke non-static
methods under static method one each & both the static methods under
main method by providing dynamic inputs
*/

import java.util.Scanner;
class Question12
{
    static Scanner sc = new Scanner(System.in);
    static float a = sc.nextFloat();
    String b = sc.next();
    static Question12 obj = new Question12();
   void m1(int a)
   {
       System.out.println(a);
   }
    void m2(double a)
   {
       System.out.println(a);
   }
   static void m3(char a)
   {
       System.out.println(a);
       obj.m1(sc.nextInt());
   }
   static void m4(int a)
   {
       System.out.println(a);
       obj.m2(sc.nextDouble());
   }
	public static void main(String[] args) 
	{
	  m3(sc.next().charAt(0));
	  m4(sc.nextInt());
	  System.out.println(a+" "+obj.b);
	}
}

/*
output:
12.11
madhu
a
a
101
101
201
201
12.12345
12.12345
12.11 madhu
*/
