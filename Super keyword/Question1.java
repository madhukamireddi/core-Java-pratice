/*
create a java application where we need to satisfy super at variable level
*/

class A
{
    int a = 10;
}
class B extends A
{
    static int a = 20;
    void m1()
    {
       	System.out.println(a);
        System.out.println(super.a); 
    }
}
public class Question1
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.m1();
	}
}
/*
output:
20
10
*/