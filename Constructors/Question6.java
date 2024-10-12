/*
create a java application where we have a java class it contains 
a static variable and a non-static variable and an object parameterized
constructor then print those variable under this constructor and invoke
this constructor under main method by providing dynamic inputs.
*/

import java.util.Scanner;
class Question6
{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    String b = sc.next();
    Question6()
    {
        System.out.println("default constructor");
    }
    Question6(Question6 obj)
    {
        System.out.println(a+" "+obj.b);
    }
	public static void main(String[] args) 
	{
	   Question6 obj= new Question6();
	   new Question6(obj);
	   //Question6 obj= new Question6(new Question6());
	   
	}
}

/*
output:
101
madhu
default constructor
201
101 Madhu
*/