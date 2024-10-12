/*
create a java application where we have a java class it contains 
a non-static method m1 having no parameter & returns boolean and 
a static method m2 having string as parameter and returns nothing 
then invoke m1 method under main method and m1 returns true then 
invoke m2 method or else print a user friendly message by providing
dynamic inputs
*/

import java.util.Scanner;
class Question13
{
    static Scanner sc = new Scanner(System.in);
   boolean m1()
   {
       System.out.println("m1 method");
       return sc.nextBoolean();
   }
    static void m2(String a)
   {
       System.out.println(a);
   }
	public static void main(String[] args) 
	{
	   Question13 obj = new  Question13();  
        if(obj.m1()==true)
        {
            m2(sc.next());
        }
        else
        {
            System.out.println("Method m1 returns false");
        }
	}
}

/*
output:
case1 : true

m1 method
true
madhu
madhu

case 2: false

m1 method
false
Method m1 returns false



/*