/*
t1 -> A-Z
t2 -> a-z
o/p:- A_G,a-g,H-Z,h-z
*/
class A extends Thread
{
   public void run()
   {
       m1();
   }
   void m1()
   {
       for(char i='A'; i<='Z';i++)
       {
           System.out.print(i+" ");
           if(i=='G')
           {
               C.t2.resume();
               C.t1.suspend();
           }
       }
             C.t2.resume();
   }
}
class B extends Thread
{
   public void run()
   {
       m1();
   }
   void m1()
   {
       for(char i='a'; i<='z';i++)
       {
           System.out.print(i+" ");
           if(i=='g')
           {
               C.t1.resume();
               C.t2.suspend();
           }
       }
   } 
}
class C 
{
    static A t1;
    static B t2;
    public static void main (String[] args) {
        t1 = new A();
        t2 = new B();
        t1.start();
        t2.start();
        t2.suspend();
    }
}
/*
output:
A B C D E F G a b c d e f g H I J K L M N O P Q R S T U V W X Y Z h i j k l m n o p q r s t u v w x y z 
*/