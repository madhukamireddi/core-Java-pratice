/*
create a java application where we have one class it contains
all 8 methods then invoke any one of the method under main method
and rest under one another methods by providing dynamic inputs.
*/ 

import java.util.Scanner;
class Question25
{
    static Scanner sc = new Scanner(System.in);
    static void m1(int a)
    {
        System.out.println(a);
    }
    static int m2()
    {
        System.out.println("Static method no parameters but having return type");
        m1(sc.nextInt());
        return sc.nextInt();
    }
    static void m3()
    {
        System.out.println("static method NO para and return type");
        System.out.println(m2());
    }
    static int m4(String a)
    {
        System.out.println(a);
        m3();
        return sc.nextInt();
    }
    void m5(int a)
    {
        System.out.println(a);
        System.out.println(m4(sc.next()));
    }
    int m6()
    {
        System.out.println("non-static method no parameters but having return type");
        m5(sc.nextInt());
        return sc.nextInt();
    }
    void m7()
    {
        System.out.println("non-static method NO para and return type");
        System.out.println(m6());
        
    }
    int m8(String a)
    {
        System.out.println(a);
        m7();
        return sc.nextInt();
    }
    
	public static void main(String[] args) 
	{
        Question25 obj = new Question25();
        System.out.println(obj.m8(sc.next()));
	}
}

/*
output:
madhu
madhu
non-static method NO para and return type
non-static method no parameters but having return type
101
101
kiran
kiran
static method NO para and return type
Static method no parameters but having return type
201
201
301
301
401
401
501
501
601
601

*/