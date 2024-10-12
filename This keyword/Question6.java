/*
create a java application where we have a java class it contains
a static variable and a non-static variable , a static method
and a non-static method and call them without writing anything 
in the main method except sop(System.out.println()).

*/
import java.util.Scanner;
class Question6
{
    static Scanner sc = new Scanner(System.in);
    static boolean a  = sc.nextBoolean();
    int b = sc.nextInt();
    static float c = new Question6().m2(sc.next().charAt(0));
    static int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    float m2(char a)
    {
       System.out.println(a); 
       System.out.println(this.m1(sc.next()));
       return sc.nextFloat();
    }
   public static void main(String[] args) 
   {
       System.out.println("Ends.........");
   }

}
/*
output:
true
101
a
a
Madhu
Madhu
201
201
12.11
Ends.........

*/

