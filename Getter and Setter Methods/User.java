/*
create a java application where we have class Instagram it contains
two private field like username and password take another class user
and then reset both username and password then display the credentials
to user
*/
import java.util.*;
class Instagram
{
	static Scanner sc = new Scanner(System.in);
	private String userName = "Hello";
	private String password = "Hi@123";
	void setPassword(String password)
	{
	    this.password = password;
	}
	void setUserName(String userName)
	{
	    this.userName = userName;
	}
	String getPassword()
	{
	    return password;
	}
	String getUserName()
	{
	    return userName;
	}
}
class User
{
    	static Scanner sc =Instagram.sc;
    	public static void main(String[] args)
    	{
            Instagram obj = new Instagram();
            System.out.println("Which do you want to reset either password or username or both :");
            String choice = sc.next();
            if(choice.equals("username"))
            {
                System.out.println("Enter your username :");
                obj.setUserName(sc.next());
                System.out.println("your new username is:"+obj.getUserName());
            }
            else if(choice.equals("password"))
            {
                System.out.println("Enter your password :");
                obj.setPassword(sc.next());
                System.out.println("your new password is:"+obj.getPassword());

            }
            else if(choice.equals("both"))
            {
                    System.out.println("Enter your username :");
                    obj.setUserName(sc.next());
                    System.out.println("Enter your password :");
                    obj.setPassword(sc.next());
                    System.out.println("your new username is:"+obj.getUserName());
                    System.out.println("your new password is:"+obj.getPassword());
            }
            else
            {
                System.out.print("Invalid Input.");
            }
        
    	}
}
/*
output:

case 1:
Which do you want to reset either password or username or both :
password
Enter your password :
Madhu@12345
your new password is:Madhu@12345


case 2:
Which do you want to reset either password or username or both :
username
Enter your username :
Madhu
your new username is:Madhu

case 3:
Which do you want to reset either password or username or both :
both
Enter your username :
Madhu
Enter your password :
Madhu@123
your new username is:Madhu
your new password is:Madhu@123

*/




