/*
create a java application where we have one class it contains 
a non-static method m1 having two integer parameters and returns
nothing perform division operations  to the parameter  in this
method and if any Exception occurs in the process handle it and 
invoke this method under main method using dynamic inputs.
*/
import java.util.Scanner;
class Question1
{
    static Scanner sc = new Scanner(System.in);
    void m1(int a, int b)
    {
      
        try {
           int  result = a/b;
           System.out.println(result);
            
        } catch(Exception e) {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Hello");
        }
    }
    public static void main (String[] args) 
    {
        Question1 obj = new Question1();
        obj.m1(sc.nextInt(),sc.nextInt());
    }
}
/*
output:

case 1: When exception raises
20
0
java.lang.ArithmeticException: / by zero
Hello

case 2 : exception not occurred
232
5
46
Hello

*/

