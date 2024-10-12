/*
create a java application where we need to satisfy overriding 
*/
import java.util.*;
class A
{
    static Scanner sc = new Scanner(System.in);
    int m1(boolean a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    int m1(long a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
}
class B extends A
{
    int m1(boolean a)
    {
        System.out.println(a);
        System.out.println(super.m1(sc.nextBoolean()));
        return sc.nextInt(); 
    }
    int m1(long a)
    {
        System.out.println(a);
        System.out.println(super.m1(sc.nextLong()));
        return sc.nextInt(); 
    } 
}
class Question3
{
    static Scanner sc = B.sc;
        public static void main(String[] args)
    	{
            B obj = new B();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m1(sc.nextLong()));
    	}
}
/*
output:
true
true
false
false
101
101
201
201
123456789
123456789
12345678
12345678
301
301
401
401
*/


