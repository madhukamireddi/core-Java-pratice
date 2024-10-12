/*
create a java application where we have a java class it contains 
a static variable and a non-static variable and a parameterized
constructor then invoke all of these under main methods by 
providing dynamic inputs.
*/

import java.util.Scanner;
class Question3
{
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    String b = sc.next();
    Question3(long l)
    {
        System.out.println(l);
    }
	public static void main(String[] args) 
	{
	   Question3 obj= new Question3(sc.nextLong());
	   System.out.println(a+" "+obj.b);
	}
}

/*
output:
101
123456
madhu
123456
101 madhu

*/