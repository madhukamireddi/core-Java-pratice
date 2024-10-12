/*
create a java application where we have a java class it contains 
a static method m1 having boolean,long as parameters and returns
short and a non-static method m2 having double as parameter and
returns m1 method return value then invoke these methods.
*/
import java.util.Scanner;
class Question15
{
    static Scanner sc = new Scanner(System.in);
   static short m1(boolean a,long b)
   {
       System.out.println(a+" "+b);
       return sc.nextShort();
   }
   short m2(double a)
   {
       System.out.println(a);
       short b = m1(sc.nextBoolean(),sc.nextLong());
       return b;
   }
	public static void main(String[] args) 
	{
	   Question15 obj = new  Question15();  
	   System.out.println(obj.m2(sc.nextDouble()));
	}
}

/*
output:
12.12345
12.12345
true' 
123456
true 123456
10
10

*/
