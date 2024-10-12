/* create a java application where we need to create 
two custom defined threads,this two threads will access 
a non static method m1 which iterates the values from
1 to 20 then print all the three multiples by using first 
and thread and all 4 multiples using second thread.
*/

class Question5 extends Thread
{
    public void run()
    {
       m1();
    }
    void m1()
    {
        for(int i = 1; i <=20; i++)
        {
            Thread t = Thread.currentThread();
            if(t.getName().equals("t1"))
            {
                if(i%3==0)
                {
                    System.out.print(i+" ");
                }
            }
            if(t.getName().equals("t2"))
            {
                if(i%4==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main (String[] args) {
        
        Question5 t1 = new Question5();
        Question5 t2 = new Question5();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
/*
output:
3 6 9 4 12 15 8 12 16 20 18 
*/
