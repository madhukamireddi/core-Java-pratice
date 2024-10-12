/*
create a java application where we have one class it contains
a non static method and a member inner class which contains two
non-static methods and a static inner class contains which contains
one static and non-static methods then invoke all of these under main 
of separate class Test.
*/
import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
    class A
    {
        int m1(String a)
        {
            System.out.println(a);
            return sc.nextInt();
        }
        float m2(char a)
        {
            System.out.println(a);
            return sc.nextFloat();
        }
    }
    
    static class B
    {
        static boolean m3(long a)
        {
            System.out.println(a);
            return sc.nextBoolean();
        }
        short m4(String a)
        {
            System.out.println(a);
            return sc.nextShort();
        }
    }
}
class Test
{
    static Scanner sc = Question5.sc;
    public static void main (String[] args) 
    {
        Question5 obj = new Question5();
        Question5.A obj1 = obj.new A();
        System.out.println(obj1.m1(sc.next()));
        System.out.println(obj1.m2(sc.next().charAt(0)));
        Question5.B obj2 = new Question5.B();
        System.out.println(Question5.B.m3(sc.nextLong()));
        System.out.println(obj2.m4(sc.next()));
    }
    
}

/*
output:
madhu
madhu
101
101
a
a
12.11
12.11
123456765432
123456765432
false
false
Naveen
Naveen
23
23
*/
