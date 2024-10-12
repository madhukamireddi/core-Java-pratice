/*
create a java application where we have a java class it contains
a non-static variable and a static method and non-static method
having parameter and return type then inherit this class into
another class which contains one static variable and non-static
variable and a non-static method then invoke all of these under
main method by providing dynamic inputs.
*/
import java.util.Scanner;
class BaseClass
{
	static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	static int m1(String a)
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

class DerivedClass extends BaseClass
{
	static char b = sc.next().charAt(0);
	boolean c = sc.nextBoolean();

	long m3(short a)
	{
		System.out.println(a+" "+this.a+" "+this.b+" "+this.c);
		return sc.nextLong();
	}
}
class Question1
{
	static Scanner sc = BaseClass.sc;
	    public static void main(String [] args)
	{
		DerivedClass obj = new DerivedClass();
		System.out.println(DerivedClass.m1(sc.next()));
		System.out.println(obj.m2(sc.next().charAt(0)));
		System.out.println(obj.m3(sc.nextShort()));
	}
}
/*
output:
a
101
false
madhu
madhu
201
201
b
b
12.11
12.11
10
10 101 a false
123456789
123456789
*/
