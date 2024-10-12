/*
create a java application we need to handle 3 different type of
Exceptions in three different ways.
*/
import java.util.Scanner;
class Question6
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        int arr [] = {10,20,30,40};
        try {
            for(int i = 0; i<7; i++)
            {
                System.out.println(arr[i]);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        String s = null;
        try {
            System.out.println(s.charAt(0));
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        int a =sc.nextInt(); int b = sc.nextInt();
        try {
            System.out.println(a/b);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
/*
output:
10
20
30
40
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
null
10
0
java.lang.ArithmeticException: / by zero
	at Question6.main(Question6.java:28)
*/