/*
create a java application where we have one abstract class it contains
one abstract method then inherit this class into another abstract class
which contains one abstract and one defined method and an parameterized
constructor and we have a separate class which contains one non-static
method and a parameterized constructor then provide functionality for
the abstract class in a separate concrete class and then invoke all of 
these properties under main method of separate class Test.
*/
import java.util.*;
abstract class A
{
    static Scanner sc = new Scanner(System.in);
    abstract int m1(boolean a);
}
abstract class B extends A
{
        abstract float m2(char a);
        boolean m3(short a)
        {
            System.out.println(a);
            return sc.nextBoolean();
        }
    B(char a)
    {
        System.out.println(a);
        System.out.println("B cons");
    }

}
class C 
{
    static Scanner sc = A.sc;
    C(int a)
    {
        System.out.println(a);
        System.out.println("Class C constructor");
    }
     int m4(boolean a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
}
class D extends B
{
    D()
    {
        super(sc.next().charAt(0));
    }
    int m1(boolean a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    float m2(char a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
}
class Question4
{
    static Scanner sc = A.sc;
        public static void main(String[] args)
    	{
            D obj = new D();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m2(sc.next().charAt(0)));
            System.out.println(obj.m3(sc.nextShort()));
            C obj1 = new C(sc.nextInt());
            System.out.println(obj1.m4(sc.nextBoolean()));
    	}
}
/*
output:
a
a
B cons
false
false
101
101
b
b
12.11
12.11
10
10
true
true
301
301
Class C constructor
false
false
401
401
*/



