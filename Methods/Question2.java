/* 
create a java application where we have a java class it contains 
one static variable, one non-static variable and another static variable
and a non-static method m1 having no parameters and return nothing,it 
contains two local variables then print all of the variables under this
method by providing dynamic inputs.  
*/

import java.util.Scanner;
class Question2
{
   static Scanner sc = new Scanner(System.in);
   static int a = sc.nextInt();
   int b = sc.nextInt();
   static String s1 = sc.next();
   
   void m1()
   {
       
       char c = sc.next().charAt(0);
       float d = sc.nextFloat();
       Question2 obj = new Question2();
       System.out.println(obj.a+" "+obj.b+" "+c+" "+d+" "+obj.s1);
   }
	public static void main(String[] args) 
	{
	    Question2 obj= new Question2();
	    obj.m1();
	}
}
/*
output:
101
madhu
201
a
12.11
301
101 301 a 12.11 madhu   
*/