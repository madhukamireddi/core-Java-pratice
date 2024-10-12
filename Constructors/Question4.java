/*
create a java application where we have a java class it contains 
2 non-static variables without initialization and then initialize
those variables while creating object and then print those variables
under a non-static method like display
*/

import java.util.Scanner;
class Question4
{
    static Scanner sc = new Scanner(System.in);
    int a;
    String b;
    Question4(int x, String y)
    {
        a = x;
        b = y;
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
	public static void main(String[] args) 
	{
	   Question4 obj= new Question4(sc.nextInt(),sc.next());
	   obj.display();
	}
}

/*
output:
101
Naveen
101 Naveen
*/