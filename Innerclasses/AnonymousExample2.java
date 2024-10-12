/*
create a java application where we have one java class it contains
a abstract class which contains two abstract methods and a defined 
method and a parameterized constructor and a interface which contains
one abstract method then provide functionality for these by using 
anonymous inner.
*/ 
import java.util.Scanner;
 abstract class Question9
{
    static Scanner sc = new Scanner(System.in);
    abstract float m1(boolean a);
    abstract int m2(String a);
    char m3(double a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    Question9(int a)
    {
        System.out.println("parameterized constructor"+a);
    }
}
interface I1
{
    short m4(long a);
}
class AnonymousExample2 
 {
     static Scanner sc = Question9.sc;
        public static void main (String[] args) 
        {
            Question9 obj = new Question9(sc.nextInt()){
                
                float m1(boolean a)
                {
                    System.out.println(a);
                    return sc.nextFloat();
                }
                int m2(String a)
                {
                    System.out.println(a);
                    return sc.nextInt();
                }
            };
            System.out.println(obj.m1(sc.nextBoolean()));
            System.out.println(obj.m2(sc.next()));
            System.out.println(obj.m3(sc.nextDouble()));
            
            I1 obj1 = new I1(){
               public short m4(long a)
                {
                    System.out.println(a);
                    return sc.nextShort();
                }
            };
            System.out.println(obj1.m4(sc.nextLong()));

        }
 }
/*
output:
1012
parameterized constructor1012
false
false
32.234
32.234
Madhu
Madhu
201
201
32.123456543
32.123456543
x
x
9483492442
9483492442
10
10
*/
