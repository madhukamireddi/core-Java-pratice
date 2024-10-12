/*
create a java application where we have one class it contains
a static and a non-static variable and a static block which
displays a user friendly message and it contains a variable
and a an instance block which prints user friendly message
and it contains a variable, and we have another static and 
non-static variable and a parametrized constructor then invoke
all of these by providing dynamic inputs.
*/
import java.util.Scanner;
class StaticBlockExample
{
   static  Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    String  b = sc.next();
    static 
    {
        System.out.println("This is static block starting");
        float a = sc.nextFloat();
        System.out.println("This is static block ending");
    }
    {
        System.out.println("This is instance block");
        long a = sc.nextLong();
    }
    static char c = sc.next().charAt(0);
    boolean d = sc.nextBoolean();
    StaticBlockExample(double a)
    {
        System.out.println(a);
    }
        public static void main(String[] args) 
	    {
            StaticBlockExample obj = new StaticBlockExample(sc.nextDouble());
            System.out.println(a+" "+obj.b+" "+c+" "+obj.d);
	    }
}
/*
output:
101
This is static block starting
12.11
This is static block ending
a
12.123
Madhu
This is instance block
12345678
true
12.123
101 Madhu a true
*/



