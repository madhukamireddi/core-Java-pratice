/*
create a java application where we have a java class it contains
a non-static variable and a single parameterized constructor and 
a double parameterized constructor then invoke single parameterized
constructor under double parameterized constructor and double
parameterized constructor under main by creating only one memory
space
*/
import java.util.Scanner;

class Question4
{
    static Scanner sc = new Scanner(System.in);
    Question4(int a)
    {
        System.out.println(a);
    }
    Question4(int a, String b)
    {
        this(sc.nextInt());
        System.out.println(a+" "+b);
    }
   public static void main(String[] args) 
   {
      Question4 obj =  new Question4(sc.nextInt(),sc.next());
   }

}
/*
output:
101
madhu
201
201
101 madhu
*/