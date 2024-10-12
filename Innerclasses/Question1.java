/*
create a java application where we have one class it contains
a private variable and a non-static method and member inner
class which contains one non-static method then invoke all of  
these under main of outer class by providing dynamic inputs. 
*/
import java.util.Scanner;
class Question1
{
   static  Scanner sc = new Scanner(System.in);
    private int a = sc.nextInt();
    int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    class A
    {
        float m2(long a)
        {
            System.out.println(a);
            return sc.nextFloat();
        }
    }
    	public static void main(String[] args) 
	    {
            Question1 obj = new Question1();
            System.out.println(obj.m1(sc.next()));
            System.out.println(obj.a);
            Question1.A obj1 = obj.new A();
            System.out.println(obj1.m2(sc.nextLong()));
	    }
}
/*
output:
101
Madhu
Madhu
201
201
101
1234567
1234567
12.11
12.11
*/
