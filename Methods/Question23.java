/*
create a java application where we have one class it contains
static method and call/invoke it and don't write a single line
in the main method 
*/ 

import java.util.Scanner;
class Question23
{
    static Scanner sc = new Scanner(System.in);
    static boolean a = m1(sc.nextInt());
    static boolean m1(int a)
    {
        System.out.println(a);
        return sc.nextBoolean();
    }

	public static void main(String[] args) 
	{

	}
}

/*
output:
101
101
false
*/
