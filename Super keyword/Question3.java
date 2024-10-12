/*
create a java application where we have one class it contains
a non-static variable and a parameterized constructor then
inherit this class into another class which contains a non-static
variable and a parameterized constructor then invoke of all of this
by providing dynamic inputs.
*/
import java.util.*;
class A
{
	static Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	A(float a)
	{
		System.out.println(a);
	}
	int m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextInt();
	}

}
class B extends A
{
	String a =sc.next();
	B(float a)
	{
	    super(sc.nextFloat());
		System.out.println(a);
	}
	int m2(boolean a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		// System.out.println(super.m1(sc.next()));
		return sc.nextInt();
	}
}
public class Question3
{
	static Scanner sc = A.sc;
	public static void main(String[] args)
	{
		B obj = new B(sc.nextFloat());
		obj.m1(sc.next());
		obj.m2(sc.nextBoolean());
	}
}
/*
output:
12.11
12.22
101
12.22
Madhu
12.11
Naveen
Naveen
101
201
true
true
Madhu
101
301
*/