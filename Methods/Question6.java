/*
create a java application where we have a java class it contains 
a non-static variable and a static method m1 having parameter and
return type and a  non-static method m2 having parameters and return 
type and a static method m3 having parameter and returns nothing then
invoke all of these methods under main method by providing dynamic inputs
*/
import java.util.Scanner;
class Question6
{
    static Scanner sc = new Scanner(System.in);
    String s = sc.next();
   static boolean m1(long a)
   {
       System.out.println(a);
       return sc.nextBoolean();
   }
    int m2(String a)
   {
       System.out.println(a);
       return sc.nextInt();
   }
   static void m3(short a)
   {
       System.out.println(a);
   }
	public static void main(String[] args) 
	{
	   Question6 obj= new Question6();
	   System.out.println(m1(sc.nextLong()));
	   System.out.println(obj.m2(sc.next()));
	    m3(sc.nextShort());

	}
}