/*
create a java application where we have a java class we need
to satisfy this at all levels
*/
import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
    boolean a  = sc.nextBoolean();
    Question5()
    {
        this(sc.nextInt());
    }
    Question5(int a)
    {
        System.out.println(a);
        System.out.println(this.m1(sc.next()));
    }
    int m1(String a)
    {
        System.out.println(a+" "+this.a);
        System.out.println(this.m1(sc.next().charAt(0)));
        return sc.nextInt();
    }
    float m1(char a)
    {
       System.out.println(a+" "+this.a); 
       System.out.println(this.m1(sc.nextInt()));
       return sc.nextFloat();
    }
    boolean m1(int a)
    {
        System.out.println(a+" "+this.a);
        return sc.nextBoolean();
    }
   public static void main(String[] args) 
   {
      Question5 obj =  new Question5();
      
   }

}

/*
output:
101
true
101
madhu
madhu true
a
a true
201
201 true
false
false
12.11
12.11
301
301
*/
