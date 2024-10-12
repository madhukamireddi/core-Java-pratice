/*
create a java application where we have two interface containing one
abstract method and one defined method each and an abstract class 
which contains one abstract method and a class which contains a
parameterized constructor and one static and one non-static method
then provide functionality for the both interfaces and abstract class
in a separate concrete class by inheriting them all at once and invoke
them by providing dynamic inputs.
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
interface I2 
{
    static Scanner sc = I1.sc;
    int m3(boolean a);
    static boolean m4(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    
}
abstract class A 
{
    static Scanner sc = I1.sc;
    A(int a)
    {
        System.out.println(a);
    }
    static char m5(int a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    byte m6(String a)
    {
        System.out.println(a);
        return sc.nextByte();
    }
}
class Question4 extends A implements I1,I2
{
    static Scanner sc = I1.sc;
    Question4()
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
    public static void main (String[] args) 
    {
            Question4 obj = new Question4();
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
Naveen
Naveen
13.11
13.11
z
z
98765432.12
9.876543212E7
false
false
321
321
76252762456
76252762456
true
true
643
643
g
g
Chaitu
Chaitu
125
125
*/
 

