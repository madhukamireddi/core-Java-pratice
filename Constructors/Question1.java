/*
create a java application where we have a java class it contains 
default constructor then invoke this constructor under main
*/

import java.util.Scanner;
class Question1
{
    Question1()
    {
        System.out.println("Default Constructor");
    }
	public static void main(String[] args) 
	{
	   Question1 obj= new Question1();
	}
}
/*
output:
Default Constructor
*/
