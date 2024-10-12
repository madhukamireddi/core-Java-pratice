/*
create a java application where we have class Facebook it contains
a private field like password then provide setter and getter methods
for this variable, we have a separate class Ramesh from here reset
Ramesh password and display the new password to Ramesh by providing
dynamic inputs.
*/
import java.util.*;
class Facebook
{
	static Scanner sc = new Scanner(System.in);
	private String password = "Madhu@123";
	void setPassword(String password)
	{
	    this.password = password;
	}
	String getPassword()
	{
	    return password;
	}
}
class Ramesh
{
    	static Scanner sc =Facebook.sc;
    	public static void main(String[] args)
    	{
            Facebook obj = new Facebook();
            System.out.println("Enter your new password:");
            obj.setPassword(sc.next());
            System.out.println("your new password is:"+obj.getPassword());
    	}
}
/*
output:
Enter your new password:
Welcome@123456
your new password is:Welcome@123456
*/


