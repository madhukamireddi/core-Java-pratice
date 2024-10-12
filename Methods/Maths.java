/*
create a java application where we have one class name Maths it 
contains a non-static method add, having 2 integer parameters and
returns the summation of parameters and another non-static method
sub having 2 integer parameters and returns the subtraction of 
the parameters and a static method mul having no parameters and 
returns the multiplication of add and, sub methods return values
*/

import java.util.Scanner;
class Maths
{
    static Scanner sc = new Scanner(System.in);
    int sum(int a, int b)
    {
        System.out.println(a+b);
        return a+b;
    }
    int sub(int a, int b)
    {
        System.out.println(a-b);
        return a-b;
    }
    static int  mul()
    {
      Maths obj = new Maths();
      int sumValue = obj.sum(sc.nextInt(),sc.nextInt());
      int subValue = obj.sub(sc.nextInt(),sc.nextInt());
      return sumValue*subValue;
    }

	public static void main(String[] args) 
	{
	    System.out.println(mul());
	}
}

/*

output:
20 
10
30
20
10
10
300

*/