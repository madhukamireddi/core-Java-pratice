/*
create a java application where we have two interface having one abstract
method each then inherit these two interfaces into an abstract class which
contains one abstract and one defined and a parameterized constructor then
we have another separate class which provides functionality for them and a 
separate class which contains a parameterized constructor and a non-static
method then inherit all these properties under main of separate class Test.

*/
import java.util.*;
interface I1
{
    static Scanner sc = new Scanner(System.in);
    float m1(String a);
}
interface I2 
{
    static Scanner sc = I1.sc;
    int m2(boolean a);
}
abstract class A implements I1,I2
{
    static Scanner sc = I1.sc;
    A(int a)
    {
        System.out.println(a);
    }
    abstract char m3(int a);
    byte m4(String a)
    {
        System.out.println(a);
        return sc.nextByte();
    }
}
class B extends A 
{
    static Scanner sc = I1.sc;
    B()
    {
        super(sc.nextInt());
    }
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
    public char m3(int a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
}
class C 
{
    static Scanner sc = I1.sc;
    C(short a)
    {
        System.out.println(a);
    }
    boolean m5(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();    
    }
    
}
class Test
{
    static Scanner sc = I1.sc;
    public static void main (String[] args) 
    {
            B obj = new B();
            System.out.println(obj.m1(sc.next()));
    	    System.out.println(obj.m2(sc.nextBoolean()));
    	    System.out.println(obj.m3(sc.nextInt()));
    	    System.out.println(obj.m4(sc.next()));
    	    C obj1 = new C(sc.nextShort());
    	    System.out.println(obj1.m5(sc.nextLong()));
    }
}
/*
output:
101
101
Kiran
Kiran
63.23
63.23
true
true
6463
6463
853
853
f
f
Hari
Hari
42
42
265
265
855737783
855737783
false
false
*/




