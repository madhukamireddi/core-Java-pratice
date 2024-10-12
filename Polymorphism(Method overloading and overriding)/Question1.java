/*
create a java application where we have one class it contains
one static and two non-static methods having same name and different
parameters then invoke them by providing dynamic inputs.
*/
import java.util.*;
class Question1
{
    static Scanner sc = new Scanner(System.in);
    static int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    int m1(float a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    int m1(char a)
    {
        System.out.println(a);
        return sc.nextInt(); 
    }
    	public static void main(String[] args)
    	{
            Question1 obj = new Question1();
            System.out.println(m1(sc.next()));
            System.out.println(obj.m1(sc.nextFloat()));
            System.out.println(obj.m1(sc.next().charAt(0)));
    	}
}
/*
output:
Madhu
Madhu
12.11
101
12.11
12.11
201
201
a
a
301
301
*/
