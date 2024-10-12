/*
write where we need to handle NullPointerException.

method 1:
import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        String s = null;
        try {
            System.out.println(s.charAt(0));
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

*/
// method 2:

import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    void m1()
    {
        System.out.println("Method m1");
    }
    public static void main (String[] args) 
    {
        try {
            Question4 obj = null;
            obj.m1();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}


/*
output:
java.lang.NullPointerException
*/
