/* create a java application where we need to create 
2 custom defined Threads, 1 prints the numbers from 
1 to 15 and another Thread prints the numbers from 40
to 50 then keep 2nd Thread in waiting state until 1st
thread print number up to 5 and then resume that Thread
from waiting state to running state.
*/

class A extends Thread
{
    public void run()
    {
       m1();
    }
    void m1() 
    {
        for(int i = 1; i <=15; i++)
        {
            System.out.print(i+" ");
            if(i==5)
            {
                B.t2.resume();
            }
        }
    }
}
class B extends Thread
{
    static B t2;
    public void run()
    {
       m2();
    }
    void m2()
    {
        for(int i =40; i <=50; i++)
        {
            System.out.print(i+" ");
        }
    }
    public static void main (String[] args) throws Exception
    {
        A t1 = new A();
        t2 = new B();
        t1.start();
        t2.start();
        t2.suspend();
    }
}
/*
output:
1 2 3 4 5 40 41 42 6 7 8 9 10 11 12 13 14 15 43 44 45 46 47 48 49 50 
*/


    