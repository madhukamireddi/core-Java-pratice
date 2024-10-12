/*
create a java application where we have one interface
which contains two abstract methods then provide functionality
in a separate concrete class and invoke them by providing dynamic
inputs.
*/
import java.util.*;
interface I1
{
    static Scanner sc = new Scanner(System.in);
    float m1(String a);
    int m2(boolean a);
}
class 12 implements I1
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
    	    Question1 obj = new Question1();
    	    System.out.println(obj.m1(sc.next()));
    	    System.out.println(obj.m2(sc.nextBoolean()));
    	}
}



