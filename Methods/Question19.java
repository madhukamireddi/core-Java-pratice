/*
create a java application where we have one class it contains
a non-static variable and two non-static methods and 2 static
methods having parameters and return type then invoke non-static
methods under static methods one each and invoke static  methods
under main method only by using object reference(new <className>()) 
by providing dynamic inputs.

*/ 

import java.util.Scanner;
class Question19
{
    static Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String m1(int a)
    {
        System.out.println(a);
        return sc.next();
    }
    float m2(long a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    static int  m3(char a)
    {
      System.out.println(a);
      System.out.println(new Question19().m1(sc.nextInt()));
      return sc.nextInt();
    }
    static boolean m4(short a)
    {
        System.out.println(a);
        System.out.println(new Question19().m2(sc.nextInt()));
        return sc.nextBoolean();
    }
	public static void main(String[] args) 
	{
	    System.out.println(m3(sc.next().charAt(0)));
	    System.out.println(m4(sc.nextShort()));
	    System.out.println(new Question19().s);
	}
}

/*
output:
a
a
madhu
101
101
kiran
kiran
201
201
10
10
naveen
301
301
12.12
12.12
true
true
chaitu
chaitu

*/