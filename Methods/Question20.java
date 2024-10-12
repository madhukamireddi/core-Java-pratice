/*
create a java application where we have one class it contains
2 static variables and 2 non-static variables , 2 non-static 
methods and 2 static methods having parameters and return type
then invoke non static methods under static methods one each 
then and print all of the global variables under static methods,
then invoke static methods under main method by providing dynamic
inputs 
Note:only by using object reference(new <className>())
*/ 

import java.util.Scanner;
class Question20
{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static String b = sc.next();
    float c = sc.nextFloat();
    boolean d = sc.nextBoolean();
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
    static int  m3(char ch)
    {
      System.out.println(ch);
      System.out.println(new Question20().m1(sc.nextInt()));
      System.out.println(a+" "+b+" "+new Question20().c+" "+new Question20().d);
      return sc.nextInt();
    }
    static boolean m4(short a)
    {
        System.out.println(a);
        System.out.println(new Question20().m2(sc.nextInt()));
        return sc.nextBoolean();
    }
	public static void main(String[] args) 
	{
	    System.out.println(m3(sc.next().charAt(0)));
	    System.out.println(m4(sc.nextShort()));
	}
}

/*
output:
101
madhu
a
a
12.11
true
201
201
kiran
kiran
12.22
false
12.33
false
101 madhu 12.22 false
301
301
10
10
12.44
true
401
401
12.55
12.55
true
true

*/