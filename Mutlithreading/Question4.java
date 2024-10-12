/* create a java application where we need to create 
two custom defined threads and then print 1 to 10by 
using first thread , 30 to 40 by using second thread.
*/
class A extends Thread
{
    public void run()
    {
       m1();
    }
    void m1()
    {
        for(int i = 1; i <=10; i++)
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
        for(int i = 30; i<=40; i++)
        {
            System.out.print(i+" ");
        }
    }
    public static void main (String[] args) {
        
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}

/*
output:
30 31 1 32 33 2 3 4 5 6 7 8 9 10 34 35 36 37 38 39 40 
*/
