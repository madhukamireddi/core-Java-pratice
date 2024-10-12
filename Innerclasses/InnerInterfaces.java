/*
create a java application where we have one class it contains 
one interface it contains two abstract methods and an inner 
interface which contains one abstract method then provide
functionality for these inner interfaces.
*/
import java.util.Scanner;
interface I1
{
    float m1(boolean a);
    int m2(String a);
    interface I2
    {
        short m3(long a);
    }
}
class InnerInterfaces implements I1,I1.I2
{
    static Scanner sc = new Scanner(System.in);
                public float m1(boolean a)
                {
                    System.out.println(a);
                    return sc.nextFloat();
                }
                public int m2(String a)
                {
                    System.out.println(a);
                    return sc.nextInt();
                }
                public short m3(long a)
                {
                    System.out.println(a);
                    return sc.nextShort();
                }
                public static void main (String[] args) {
                    I1 obj = new InnerInterfaces();
                    System.out.println(obj.m1(sc.nextBoolean()));
                    System.out.println(obj.m2(sc.next()));
                    I1.I2 obj1 = new InnerInterfaces();
                    System.out.println(obj1.m3(sc.nextLong()));
                }
}
/*
output:
true
true
135
135.0
Naveen
Naveen
654
654
12345678
12345678
11
11
*/
