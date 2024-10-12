/* create a java application where we need to create 
three custom defined threads,then print 1 to 20 by 
using 1st Thread, 30 to 20 by using 2nd Thread and 
50 to 60 by using 3rd Thread.Here allow one by one
flow without any interruption.
*/

class A extends Thread
{
    public void run()
    {
       m1();
    }
    void m1()
    {
        for(int i = 1; i <=20; i++)
        {
            System.out.print(i+" ");
        }
    }
}
class B extends Thread
{
    public void run()
    {
       m2();
    }
    void m2()
    {
        for(int i =30; i <=50; i++)
        {
            System.out.print(i+" ");
        }
    }
}
class C extends Thread
{
    public void run()
    {
       m3();
    }
    void m3()
    {
        for(int i = 51 ; i <=60; i++)
        {
            System.out.print(i+" ");
        }
    }
}
class Question6
{
    public static void main (String[] args) throws Exception
    {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();
        t1.start();t1.join();
        t2.start();t2.join();
        t3.start();
    }
}
/*
output:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 

*/
    