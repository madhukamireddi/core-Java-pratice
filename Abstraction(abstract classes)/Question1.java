/*
create a java application where we have one abstract class it contains
two abstract methods having parameters and return type then provide 
functionality for this methods in a concrete class and invoke them by
providing dynamic inputs.
*/
import java.util.*;
abstract class A
{
    static Scanner sc = new Scanner(System.in);
  abstract int m1(boolean a);
  abstract float m2(char a);
}
class B extends A
{
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
class Question1
{
    static Scanner sc = B.sc;
        public static void main(String[] args)
    	{
            B obj = new B();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m2(sc.next().charAt(0)));
    	}
}
/*
output:
true
true
101
101
a
a
201
201.0
*/




