/*
create a java application where we have one abstract class it contains
one abstract method and a parameterized constructor then  inherit these
class into another abstract class which contains once abstract and one
defined method then invoke this abstract class into a concrete class and
providing functionality for all of these methods and invoke them by 
providing dynamic inputs.
*/
import java.util.*;
abstract class A
{
    static Scanner sc = new Scanner(System.in);
  A(boolean a)
  {
      System.out.println("A cons");
      System.out.println(a);
  }
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
    B()
    {
        super(sc.nextBoolean());
        System.out.println("B cons");
    }

}
class C extends B
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
class Question3
{
    static Scanner sc = B.sc;
        public static void main(String[] args)
    	{
            C obj = new C();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m2(sc.next().charAt(0)));
            System.out.println(obj.m3(sc.nextShort()));
    	}
}
/*
output:
true
A cons
true
B cons
false
false
101
101
a
a
12.11
12.11
10
10
false
false
*/



