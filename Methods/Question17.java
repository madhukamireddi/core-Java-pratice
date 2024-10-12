/*
create a java application where we have one class it contains
2 static and 2 non-static methods having parameters and return
type then invoke these methods under main method and here we don't
store the Object
*/

import java.util.Scanner;
class Question17
{
    static Scanner sc = new Scanner(System.in);
    static int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    static float m2(int a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    char m3(double a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    boolean m4(long a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }
    
	public static void main(String[] args) 
	{
	    System.out.println(m1(sc.next()));
	    System.out.println(m2(sc.nextInt()));
        System.out.println(new Question17().m3(sc.nextDouble()));
        System.out.println(new Question17().m4(sc.nextLong()));
	}
}

/*
output:
madhu
madhu
101
101
201
201
12.11
12.11
12.12345
12.12345
a
a
1234567
1234567
true
true

*/