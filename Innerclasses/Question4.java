/*
create a java application where we have one class it contains
a private variable and a non static method and a static inner 
class contains one static and non-static methods then invoke 
all of these under main of outer class.
*/
import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    private int a = sc.nextInt();
    int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    static class A
    {
        float m2(char a)
        {
            System.out.println(a);
            return sc.nextFloat();
        }
        static boolean m3(long a)
        {
            System.out.println(a);
            return sc.nextBoolean();
        }
    }
        public static void main(String[] args) 
	    {
            Question4 obj = new Question4();
            System.out.println(obj.a);
            System.out.println(obj.m1(sc.next()));
            Question4.A obj1 = new A();
            System.out.println(obj1.m2(sc.next().charAt(0)));
            System.out.println(obj1.m3(sc.nextLong()));
	    }
}
/*
output:
101
101
madhu
madhu
201
201
a
a
54.346
54.346
2345654
2345654
false
false
*/

