/*
create a java application where we have a java class it contains 
a static variable and a non-static variable and a static m1 having
parameter and return type and a non-static m2 have parameter and 
no return type and a default Constructor then print those global 
variable under Constructor and invoke those under main by providing
dynamic inputs.
*/

import java.util.Scanner;
class Question2
{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    String b = sc.next();
    Question2()
    {
        System.out.println(a+" "+b);
    }
    static float m1(char a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    void m2(boolean a)
    {
        System.out.println(a);
    }
	public static void main(String[] args) 
	{
	   Question2 obj= new Question2();
	   System.out.println(m1(sc.next().charAt(0)));
	   obj.m2(sc.nextBoolean());
	}
}

/*
output:
101
madhu
101 madhu
a
a
12.11
12.11
false
false
*/