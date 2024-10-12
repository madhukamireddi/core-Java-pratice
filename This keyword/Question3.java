/*
create a java application where we have a java class we need
to satisfy this at method level.
*/
import java.util.Scanner;

class Question3
{
    static Scanner sc = new Scanner(System.in);
    static int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    char m1(float a)
    {
        System.out.println(a);
        System.out.println(this.m1(sc.next()));
        return sc.next().charAt(0);
    }
    boolean m1(long a)
    {
        System.out.println(a);
        System.out.println(this.m1(sc.nextFloat()));
        return sc.nextBoolean();
    }
    
   public static void main(String[] args) 
   {
      Question3 obj =  new Question3();
       System.out.println(obj.m1(sc.nextLong()));
   }

}
/*
output:
1234567
1234567
12.11
12.11
madhu
madhu
101
101
a
a
true
true

*/