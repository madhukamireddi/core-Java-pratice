/*
create a java application where we have one class it contains
a non-static method inside this method we have a local inner
class which contains one non-static method then invoke these
by providing dynamic inputs.
*/
import java.util.Scanner;
class Question6
{
    static Scanner sc = new Scanner(System.in);
        int m1(String a)
        {
            System.out.println(a);
            class A
            {
                float m2(char a)
                {
                    System.out.println(a);
                    return sc.nextFloat();
                }
            }
            A obj = new A();
            System.out.println(obj.m2(sc.next().charAt(0)));
            return sc.nextInt();
        }
        public static void main (String[] args) 
        {
            Question6 obj = new Question6();
            System.out.println(obj.m1(sc.next()));
        }
        
}
/*
output:
madhu
madhu
a
a
12.43
12.43
101
101
*/

  