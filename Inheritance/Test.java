/*
create a java application where we have a java class A,class B
and class c with one non-static method in each and call those
methods in another class Test.
*/
import java.util.*;
class A
{
	static Scanner sc = new Scanner(System.in);
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class B extends A
{
	boolean m1(char a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
}
class C extends A
{
	float m1(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class Test
{
	static Scanner sc = A.sc;
	public static void main (String[] args)
	{
		B obj1 = new B();
		System.out.println(obj1.m1(sc.next()));
		System.out.println(obj1.m1(sc.next().charAt(0)));
		C obj2 = new C();
		System.out.println(obj2.m1(sc.nextShort()));
	}
}
/*
output:
madhu
madhu
101
101
a
a
true
true
10
10
12.11
12.11
*/