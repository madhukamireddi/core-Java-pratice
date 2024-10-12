/*
create a java application where we need to satisfy super at method level
*/
import java.util.*;
class A
{
    static Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int m1(String a)
    {
        System.out.println(a);
        System.out.println(this.a);
        return sc.nextInt();
    }
    
}
class B extends A
{
    float  a =sc.nextFloat();
    boolean b = sc.nextBoolean();
    int m1(String a)
    {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(b);
        System.out.println(super.m1(sc.next()));
        return sc.nextInt();
    }
}
public class Question2
{
    static Scanner sc = A.sc;
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.m1(sc.next());
	}
}
/*
output:
101
12.11
false
Madhu
Madhu
12.11
101
false
Naveen
Naveen
101
201
201
301

*/