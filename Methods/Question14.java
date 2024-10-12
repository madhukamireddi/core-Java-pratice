/*
create a java application where we have a java class it contains 
a non-static method m1 having integer as parameter and returns 
String and another non-static method m2 having String as parameter
and returns boolean then invoke both the methods under main method
invoke m2 method by passing m1 method return value as parameter by
providing dynamic inputs.
*/

import java.util.Scanner;
class Question14
{
    static Scanner sc = new Scanner(System.in);
   String m1(int a)
   {
       System.out.println(a);
       return sc.next();
   }
    boolean m2(String a)
   {
       System.out.println(a);
       return sc.nextBoolean();
   }
	public static void main(String[] args) 
	{
	   Question14 obj = new  Question14();  
	   String a = obj.m1(sc.nextInt());
	   System.out.println(obj.m2(a));
	}
}

/*

output:
101
101
madhu
madhu
true
true

*/