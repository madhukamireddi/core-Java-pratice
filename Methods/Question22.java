/*
create a java application where we have one class it contains
a non-static variable and 2 non-static methods having parameters
and return type and a static method having object as parameter and
returns Boolean then invoke those non-static methods & global 
variables under static method & invoke static method under main
by providing dynamic inputs.
*/ 

import java.util.Scanner;
class Question22
{
    static Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    String m1(int a)
    {
        System.out.println(a);
        return sc.next();
    }
    double m2(char a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
    static boolean m3(Question22 a)
    {
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.m1(sc.nextInt()));
        System.out.println(a.m2(sc.next().charAt(0)));
        return sc.nextBoolean();
    }

	public static void main(String[] args) 
	{
        System.out.println(m3(new Question22()));
	}
}

/*
output:
101
Question22@d7b1517
101
201
201
madhu
madhu
a
a
12.12345
12.12345
true
true
*/