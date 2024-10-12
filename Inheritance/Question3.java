/*
create a java application where we have a java class bank it contains
a non-static method having parameter and return type then inherit this
class into another class which contains one static and one non-static
method then inherit this class into another class which contains one 
non-static method invoke all of these methods by providing dynamic inputs.
*/
import java.util.Scanner;
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
    static float m2(char a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    boolean m3(double a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
}
class C extends B
{
    short m4(long a)
    {
        System.out.println(a);
        return sc.nextShort();
    }
}
class Question3
{
    static Scanner sc = C.sc;
    	 public static void main(String [] args)
	    {
            C obj = new C();
            System.out.println(obj.m1(sc.next()));
            System.out.println(obj.m2(sc.next().charAt(0)));
            System.out.println(obj.m3(sc.nextDouble()));
            System.out.println(obj.m4(sc.nextLong()));
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
12.11
12.11
12.1234567
12.1234567
true
true
1234567
1234567
10
10
*/
