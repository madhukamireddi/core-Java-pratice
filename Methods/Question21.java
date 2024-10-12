/*
create a java application where we have one class it contains
a non-static method having parameter and return type and a
static method m2 having object as parameter and returns nothing
then invoke these methods under main method by providing dynamic
inputs.
*/ 

import java.util.Scanner;
class Question21
{
    static Scanner sc = new Scanner(System.in);
    String m1(int a)
    {
        System.out.println(a);
        return sc.next();
    }
    static void m2(Question21 a)
    {
        System.out.println(a);
    }

	public static void main(String[] args) 
	{
        Question21 obj = new Question21();
        System.out.println(obj.m1(sc.nextInt()));
        m2(obj);
	}
}
/*
output:
101
101
madhu
madhu
Question21@16c0663d

*/