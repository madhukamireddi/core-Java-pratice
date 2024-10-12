/*
create a java application where we have to satisfy hybrid inheritance
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
	boolean m2(char a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
}
class C extends B
{
	float m3(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class D extends C
{
    char m4(boolean a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
}
class E extends C
{
    double m5(byte a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
}
class Question6
{
	static Scanner sc = A.sc;
	public static void main (String[] args)
	{
	    D obj1 = new D();
		System.out.println(obj1.m1(sc.next()));
		System.out.println(obj1.m2(sc.next().charAt(0)));
		System.out.println(obj1.m3(sc.nextShort()));
		System.out.println(obj1.m4(sc.nextBoolean()));
		E obj2 = new E();
		System.out.println(obj2.m5(sc.nextByte()));
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
false
false
b
b
1
1
12.1234567
12.1234567
*/
