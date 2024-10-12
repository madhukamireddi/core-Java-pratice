/*
create a java application where we have one interface it contains
one variable, two abstract methods and two defined methods then 
provide functionality in concrete class and invoke them by providing
dynamic inputs.
*/
import java.util.*;
interface I1
{
    static Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    float m1(String a);
    int m2(boolean a);
    default double m3(char a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
    static boolean m4(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
}
class Question2 implements I1
{
    static Scanner sc = I1.sc;
    public float m1(String a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public int m2(boolean a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
        public static void main(String[] args)
    	{
    	    Question2 obj = new Question2();
    	    System.out.println(value);
    	    System.out.println(obj.m1(sc.next()));
    	    System.out.println(obj.m2(sc.nextBoolean()));
    	    System.out.println(obj.m3(sc.next().charAt(0)));
    	    System.out.println(I1.m4(sc.nextLong()));
    	}
}
/*
output:
101
101
Madhu
Madhu
12.11
12.11
false
false
201
201
a
a
12.123456
12.123456
123456789
123456789
true
true
*/