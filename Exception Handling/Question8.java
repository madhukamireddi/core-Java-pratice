/*
create a java application where we might get 3 different types of
Exceptions then handle any one of them.
*/
import java.util.Scanner;
import java.util.InputMismatchException;
class Question8
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        try {
            int a = sc.nextInt();
            int arr [] = {10,20,30};
            System.out.println(arr[a]);
            System.out.println(10/a);
            
        } catch(InputMismatchException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
/*
output:
case 1: 
hi
java.util.InputMismatchException

case 2:
10
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3

case 3:
0
10
java.lang.ArithmeticException: / by zero

*/





