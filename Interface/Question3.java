/*
create a java application where we have one interface it contains
one abstract method and one defined method then inherit this interface
into another interface which contains one abstract and one defined 
method inherit this interface into an abstract class which contains one 
defined and one undefined method and a parameterized constructor then  
provide functionality in concrete class and invoke them by providing
dynamic inputs.
*/
import java.util.*;
interface I1
{
    static Scanner sc = new Scanner(System.in);
    float m1(String a);
    default double m2(char a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
}
interface I2 extends I1
{
    int m3(boolean a);
    static boolean m4(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    
}
abstract class A implements I2
{
    A(int a)
    {
        System.out.println(a);
    }
    abstract char m5(int a);
    byte m6(String a)
    {
        System.out.println(a);
        return sc.nextByte();
    }
}
class Question3 extends A
{
    static Scanner sc = I1.sc;
    Question3()
    {
        super(sc.nextInt());
    }
    public float m1(String a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public int m3(boolean a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public char m5(int a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
        public static void main(String[] args)
    	{
    	    Question3 obj = new Question3();
    	    System.out.println(obj.m1(sc.next()));
    	    System.out.println(obj.m2(sc.next().charAt(0)));
    	    System.out.println(obj.m3(sc.nextBoolean()));
    	    System.out.println(I2.m4(sc.nextLong()));
    	    System.out.println(obj.m5(sc.nextInt()));
    	    System.out.println(obj.m6(sc.next()));
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
a
a
12.12345678
12.12345678
false
false
201
201
123456789
123456789
true
true
301
301
c
c
Naveen
Naveen
1
1
*/



