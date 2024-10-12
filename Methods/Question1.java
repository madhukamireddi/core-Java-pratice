/*
create a java application where we have a java class 
it contains two static variables and two non static 
variables then print those variables under main method 
by providing dynamic inputs 
*/

import java.util.Scanner;
class Question1
{
   static Scanner sc = new Scanner(System.in);
   static int a = sc.nextInt();
   static int b = sc.nextInt();
   String s1 = sc.next();
   String s2 = sc.next();

	public static void main(String[] args) 
	{
	    Question1 std = new Question1();
	    System.out.println(a+" "+b);
	    System.out.println(std.s1+" "+std.s2);

	}
}
/*
output:
101
201
madhu
naveen
101 201
madhu naveen
*/