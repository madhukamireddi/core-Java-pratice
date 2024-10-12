/*
create a java application where we have one class it contains
a static method and a member inner class which contains two
non-static methods and a static inner class which contains
a non-static method and a static method inside this static
method we have a local inner class which contains one non-static
method then invoke all the possible  properties under main 
of separate class Test.
*/
import java.util.Scanner;
class Question7
{
    static Scanner sc = new Scanner(System.in);
    float m1(boolean a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    class A
    {
         int m2(String a)
         {
             System.out.println(a);
             return sc.nextInt();
        }
        char m3(long a)
        {
            System.out.println(a);
            return sc.next().charAt(0);
        }
    }
    static class B
    {
        long m4(String a)
        {
            System.out.println(a);
            return sc.nextLong();
        }
        static short m5(double a)
        {
            System.out.println(a);
            class C
            {
                boolean m6(int a)
                {
                    System.out.println(a);
                    return sc.nextBoolean();
                }
            }
            C obj = new C();
            System.out.println(obj.m6(sc.nextInt()));
            return sc.nextShort();
        }
    }
}
 class Test2
 {
     static Scanner sc = Question7.sc;
        public static void main (String[] args) 
        {
            Question7 obj = new Question7();
            System.out.println(obj.m1(sc.nextBoolean()));
            Question7.A obj1 = obj.new A();
            System.out.println(obj1.m2(sc.next()));
            System.out.println(obj1.m3(sc.nextLong()));
            Question7.B obj2 = new Question7.B();
            System.out.println(obj2.m4(sc.next()));
            System.out.println(obj2.m5(sc.nextDouble()));
        }
 }
/*
output:
false
false
12.11
12.11
Madhu
Madhu
101
101
1234567654
1234567654
a
a
Naveen
Naveen
536455734
536455734
43.543276
43.543276
201
201
true
true
10
10
*/
