/*
create a java application where we have a java class it contains 
a non-static method m1 having parameter & return type and a static
method m2 having parameter & return type and another non-static 
method m3 having parameter and return type then invoke m1 under m2, 
m2 under m3 and m3 under main method
*/

import java.util.Scanner;
class Question11
{
    static Scanner sc = new Scanner(System.in);
   
   String m1(int a)
   {
       System.out.println(a);
       return sc.next();
   }
   static short m2(double a)
   {
       System.out.println(a);
        Question11 obj = new  Question11();
        System.out.println(obj); // This one object both are not same(address are differnt)
        System.out.println(obj.m1(sc.nextInt()));
       return sc.nextShort();
   }
   boolean m3(char a)
   {
       System.out.println(a);
       System.out.println(m2(sc.nextDouble()));
       return sc.nextBoolean();
   }
	public static void main(String[] args) 
	{
	   Question11 obj = new Question11(); // This another object both are not same(address are differnt)
	   System.out.println(obj);
	  System.out.println(obj.m3(sc.next().charAt(0)));
	}
}

/*
output:
Question11@6833ce2c
a
a
12.12345
12.12345
Question11@4cdbe50f
101
101
madhu
madhu
10
10
true
true
*/
