/*
create a java application where we have a java class bank it contains
a global variable balance and 2 non-static methods like withdraw and 
deposit having amount as parameter and performs the respective operation 
and return the available balance and another non-static method balance
enquiry which displays current balance then inherit bank to user class
which contains a non-static method like transaction then invoke transaction
under main method and here perform respective operation based on user 
requirements until he went to exit.
*/
import java.util.Scanner;
class Bank
{
	static Scanner sc = new Scanner(System.in);
    double balance = 1000;
    
    double withdraw(double amount)
    {
        if(amount <=balance)
        {
          System.out.println("withdrawal successful!Remaining balance");
          balance = balance-amount;
          return balance-amount;  
        }
        else
        {
            System.out.println("Insufficent balance");
             return balance;
        }
    }
    double deposit(double amount)
    {
        balance = balance + amount;
        return balance + amount;
    }
    double enquiry()
    {
        return balance;
    }

}
class User extends Bank
{
    
	void transaction()
	{
	    while(true)
	    {
        System.out.println("Enter your choice:\n1. Withdraw\n2. Deposit\n3. Enquiry\n4. exit");
	    int choice = sc.nextInt();
	    if(choice==1)
	    {
	       System.out.println("Enter amount to withdraw");
	        System.out.println("available balance"+withdraw(sc.nextDouble())); 
	    }
	    else if(choice==2)
	    {
	        System.out.println("Enter amount to deposit");
	        System.out.println("available balance"+deposit(sc.nextDouble()));
	    }
	    else if(choice==3)
	    {
	       System.out.println(enquiry());
	    }
	    else if(choice ==4)
	    {
	        break;
	    }
	    else
	    {
	        System.out.println("Invalid Input");
	    }
	    }
	}
	  public static void main(String [] args)
	    {
	        User customer = new User();
	        customer.transaction();
	    }
}

/*
output:
Enter your choice:
1. Withdraw
2. Deposit
3. Enquiry
4. exit
1
Enter amount to withdraw
5000
Insufficent balance
available balance1000.0
Enter your choice:
1. Withdraw
2. Deposit
3. Enquiry
4. exit
1
Enter amount to withdraw
500
withdrawal successful!Remaining balance
available balance0.0
Enter your choice:
1. Withdraw
2. Deposit
3. Enquiry
4. exit
2
Enter amount to deposit
1000
available balance2500.0
Enter your choice:
1. Withdraw
2. Deposit
3. Enquiry
4. exit
3
1500.0
Enter your choice:
1. Withdraw
2. Deposit
3. Enquiry
4. exit
4

*/
