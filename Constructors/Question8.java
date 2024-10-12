/*
create a java application where we have a java class it contains 
one non-static variable and a default constructor and a single 
parameterized constructor and a double parameterized constructor
and an object parameterized constructor then invoke all of these 
by providing dynamic inputs.
*/

import java.util.Scanner;
class Question8
{
    static Scanner sc = new Scanner(System.in);
    Question8()
    {
        System.out.println("Default constructor");
    }
    Question8(int a)
    {
        System.out.println(a);
    }
    Question8(boolean a, char b)
    {
        System.out.println(a+" "+b);
    }
    Question8(Question8 obj)
    {
        System.out.println(obj);
    }
	public static void main(String[] args) 
	{
	   Question8 obj1= new Question8();
	   Question8 obj2= new Question8(sc.nextInt());
	   Question8 obj3= new Question8(sc.nextBoolean(),sc.next().charAt(0));
	   Question8 obj4= new Question8(obj3);
	}
}

/*
output:
Default constructor
101
101
true
a
true a
Question8@6e8dacdf
*/