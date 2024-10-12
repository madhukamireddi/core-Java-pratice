/*
create a java application where we need to satisfy overloading 
*/
import java.util.*;
class Question2
{
    static Scanner sc = new Scanner(System.in);
    int m1(boolean a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    int m1(long a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    	public static void main(String[] args)
    	{
            Question2 obj = new Question2();
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m1(sc.nextLong()));
    	}
}
/*
output:
false
false
101
101
123456789
123456789
201
201
*/


