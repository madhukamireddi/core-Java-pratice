/*
create a java application where we have a java class it contains 
a default constructor and a single parameterized constructor and
a double parameterized constructor and a triple parameterized
constructor and a non-static variable then invoke default under
single, single under double , double under triple and triple under
main method
*/

import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    Question5()
    {
        System.out.println("default constructor");
    }
    Question5(char a)
    {
        new Question5();
        System.out.println(a+" "+input);
    }
    Question5(boolean a, short b)
    {
        new Question5(sc.next().charAt(0));
        System.out.println(a+" "+b+" "+input);
    }
    Question5(int a, String b,float c)
    {
        new Question5(sc.nextBoolean(),sc.nextShort());
        System.out.println(a+" "+b+" "+c+" "+input);
    }
	public static void main(String[] args) 
	{
	   Question5 obj= new Question5(sc.nextInt(),sc.next(),sc.nextFloat());
	}
}

/*
output:
101
madhu
12.11
201
true
10
301
a
401
501
default constructor
a 401
true 10 301
101 madhu 12.11 201

*/
