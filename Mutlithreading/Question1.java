/* create a java application where we need to create an user defined thread and print 1 to 10. */
class Question1 extends Thread
{
    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.print(i+" ");
        }
    }
    public static void main (String[] args) {
        
        Question1 t = new Question1();
        t.start();
         for(int i =11; i <=20; i++)
         {
             System.out.print(i+" ");
         }
    }
}

/*1 2 3 4 11 5 6 12 13 14 15 16 17 18 19 20 7 8 9 10 */