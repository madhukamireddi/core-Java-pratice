/*
create a java application where we have a java class it contains 
2 instance variables without initialization then initialize these
variables while creating object and then print these variables under
a object parameterized constructor both the default values and user 
given values.
*/

import java.util.Scanner;
class Question7
{
    static Scanner sc = new Scanner(System.in);
    int rollNo ;
    String name ;
    Question7(int a, String b)
    {
        rollNo = a;
        name =b;
    }
    Question7(Question7 obj)
    {
        System.out.println(rollNo+" "+name);
        System.out.println(obj.rollNo+" "+obj.name);
    }
	public static void main(String[] args) 
	{
	   Question7 obj= new Question7(sc.nextInt(),sc.next());
	   new Question7(obj);
	}
}
/*
output:
101
madhu
0 null
101 madhu
*/
