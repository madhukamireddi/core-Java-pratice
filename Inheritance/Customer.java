/*
create a java application where we have a java class Airtel which
consists of a non-static method recharge and inherit this class to 
cellshop class where it has a non-static method like selection and 
billing inherit this class to another derived class as user and 
invoke selection method here and perform all the operations.
*/
import java.util.*;
class Airtel
{
    static Scanner sc = new Scanner(System.in);
    int  recharge(int plan)
    {
        if(plan==1)
        {
            return 299;
        }
        else if(plan==2)
        {
            return 499;
        }
        else if(plan==3)
        {
            return 799;
        }
        else 
        {
            return 0;
        }
    }
}
class cellshop extends Airtel
{
    int planValue = 0;
    void selection()
    {
        System.out.println("Here the available plans:");
        System.out.println("1.UL calls 1.0GB per day 28 days RS.299");
        System.out.println("2.UL calls 1.5GB per day 28 days RS.499");
        System.out.println("3.UL calls 2.0GB per day 28 days RS.799");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        planValue = recharge(choice);
        if(planValue==0)
        {
            System.out.println("Invalid choice.please Enter a valid plan..");
            selection();
        }
        else
        {
             billing();
        }
       
    }
    void billing()
    {
        System.out.println("your plan value is :"+planValue);
        System.out.println("              SGST :"+((planValue*5)/100));
        System.out.println("              CGST :"+((planValue*3)/100));
        System.out.println("Your Total Bill is :"+((planValue)+((planValue*5)/100)+((planValue*3)/100)));
    }
}
class Customer extends cellshop
{
    public static void main (String[] args) 
    {
           Customer obj = new Customer();
           obj.selection();
        
    }
}
/*
output:
case 1:
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
1
your plan value is :299
              SGST :14
              CGST :8
Your Total Bill is :321

case 2:
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
2
your plan value is :499
              SGST :24
              CGST :14
Your Total Bill is :537

case 3:
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
3
your plan value is :799
              SGST :39
              CGST :23
Your Total Bill is :861

case 4:
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
4
Invalid choice.please Enter a valid plan..
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
5
Invalid choice.please Enter a valid plan..
Here the available plans:
1.UL calls 1.0GB per day 28 days RS.299
2.UL calls 1.5GB per day 28 days RS.499
3.UL calls 2.0GB per day 28 days RS.799
Enter your choice: 
1
your plan value is :299
              SGST :14
              CGST :8
Your Total Bill is :321

*/




*/