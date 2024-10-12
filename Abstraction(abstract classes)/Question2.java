/*
create a java application where we have one abstract class it contains
a non-static variable, two undefined methods and two defined methods 
having parameters and return type and a parameterized constructor provide
functionality for the abstract class in separate concrete class and invoke
all the properties by providing dynamic inputs.
*/
import java.util.*;
abstract class A
{
    static Scanner sc = new Scanner(System.in);
  int value = sc.nextInt();
  A(boolean a)
  {
      System.out.println(a);
      System.out.println(value);
  }
  abstract int m1(boolean a);
  abstract float m2(char a);
  boolean m3(short a)
  {
      System.out.println(a);
      return sc.nextBoolean();
  }
  char m4(String a)
  {
      System.out.println(a);
      return sc.next().charAt(0);
  }
}
class B extends A
{
    B()
    {
        super(sc.nextBoolean());
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
class Question2
{
    static Scanner sc = B.sc;
        public static void main(String[] args)
    	{
            B obj = new B();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m2(sc.next().charAt(0)));
            System.out.println(obj.m3(sc.nextShort()));
            System.out.println(obj.m4(sc.next()));
    	}
}
/*
output:
true
101
true
101
false
false
201
201
a
a
12.11
12.11
10
10
true
true
Naveen
Naveen
b
b
*/





