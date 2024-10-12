/*
create a java application where we have one class it contains
one private variable and a static and non-static methods inside
there is member inner class which contains one non-static method 
and a member inner class which  a non-static method then invoke
all of these by providing dynamic inputs in a separate class. 
*/
import java.util.Scanner;
class Main
{
   static  Scanner sc = new Scanner(System.in);
    private int a = sc.nextInt();
    int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    static boolean m2(char a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    class A
    {
        float m3(long a)
        {
            System.out.println(a);
            return sc.nextFloat();
        }
         class B
        {
            short m4(double a)
            {
                System.out.println(a);
                return sc.nextShort();
            }
        }
    }
}
class Question2
{
    static Scanner sc = Main.sc;
        public static void main(String[] args) 
	    {
            Main obj = new Main();
            System.out.println(obj.m1(sc.next()));
            System.out.println(Main.m2(sc.next().charAt(0)));
            Main.A obj1 = obj.new A();
            System.out.println(obj1.m3(sc.nextLong()));
            Main.A.B obj2 = obj1.new B();
            System.out.println(obj2.m4(sc.nextDouble()));
            
	    }
}
/*
output:
101
madhu
madhu
343
343
h
h
true
true
876534356
876534356
1564.34
1564.34
473.242563
473.242563
234
234
*/

