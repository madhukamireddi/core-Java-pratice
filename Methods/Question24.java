/*
create a java application where we have one class it contains
a non-static method m1 having int as parameter and returns String
and a static method m2 having no parameter and having return
type then invoke these methods under main method without creating or
storing the object directly
*/ 

import java.util.Scanner;
class Question24
{
    static Scanner sc = new Scanner(System.in);
    String m1(int a)
    {
        System.out.println(a);
        return sc.next();
    }
    static Question24 m2()
    {
        System.out.println("Method m2");
        return new Question24();
    }

	public static void main(String[] args) 
	{
        Question24 obj = m2();
        System.out.println(obj.m1(sc.nextInt()));
	}
}

/*
output:
Method m2
101
101
madhu
madhu

*/