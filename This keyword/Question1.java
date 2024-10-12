/*
create a java application where we have a java class it contains 
a non-static variable and a non-static method m1 having parameter 
and return type the parameter name must be same as global variable
name then invoke this method 2 times by using different objects by 
providing dynamic inputs and print that global variable under non-static
method.
*/
import java.util.Scanner;

class Question1 
{
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    float m1(String a)
    {
        System.out.println(a);
        System.out.println(this.a);
        return sc.nextFloat();
    }
    
   public static void main(String[] args) 
   {
       Question1 obj1 =  new Question1();
       System.out.println(obj1.m1(sc.next()));
       Question1 obj2 =  new Question1();
       System.out.println(obj2.m1(sc.next()));
       
       
   }

}

/*
output:
101
Madhu
Madhu
101
12.11
12.11
201
Naveen
Naveen
201
12.22
12.22
*/

