/* create a java application where we need to create 
one java custom defined thread and print 1 to 10 by 
using it with a time interval of 1 sec.
*/
class Question3 extends Thread
{
    public void run()
    {
        m1();
    }
    static void m1()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                
            }
        }
    }
    public static void main (String[] args) {
        
        Question3 t = new Question3();
        t.start();
    }
}
/*
1 2 3 4 5 6 7 8 9 10 (delayed by 1 sec)
*/