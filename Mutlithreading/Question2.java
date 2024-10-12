/* create a java application where we need to create 
3 custom defined threads and then print the name of 
those threads along with their priority values and 
check they are in live state or not and that set user
defined name and priorities for those threads then start
them and check whether they are live state or not and
then print the priority values.
*/
class Question2 extends Thread
{
    public void run()
    {
        System.out.print("Message");
    }
    public static void main (String[] args) {
        
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        System.out.println(t1.getName()+" "+t1.getPriority());
        System.out.println(t2.getName()+" "+t2.getPriority());
        System.out.println(t3.getName()+" "+t3.getPriority());
        System.out.println(t1.getName()+" "+t1.isAlive());
        System.out.println(t2.getName()+" "+t2.isAlive());
        System.out.println(t3.getName()+" "+t3.isAlive());
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        System.out.println(t1.getName()+" "+t1.getPriority());
        System.out.println(t2.getName()+" "+t2.getPriority());
        System.out.println(t3.getName()+" "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName()+" "+t1.isAlive());
        System.out.println(t2.getName()+" "+t2.isAlive());
        System.out.println(t3.getName()+" "+t3.isAlive());
        
    }
}
/*
Thread-0 5
Thread-1 5
Thread-2 5
Thread-0 false
Thread-1 false
Thread-2 false
t1 10
t2 1
t3 5
t1 true
t2 false
t3 false
*/
