/*
create anonymous inner class Example
*/ 
import java.util.Scanner;
 abstract class Question8
{
    static Scanner sc = new Scanner(System.in);
    abstract float m1(boolean a);
}
class AnonymousExample
 {
     static Scanner sc = Question8.sc;
        public static void main (String[] args) 
        {
            Question8 obj = new Question8(){
                
                float m1(boolean a)
                {
                    System.out.println(a);
                    return sc.nextFloat();
                }
            };
            System.out.println(obj.m1(sc.nextBoolean()));

        }
 }
/*
output:
false
false
124.43
124.43
*/