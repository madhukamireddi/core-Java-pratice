/*
create a java application which contains class Insta it contains 
three private fields like username, password and phoneNumber then
provide setter and getter methods for this variables take a separate
class user which contains a non-static method login.Here ask the user
to enter his credentials then both username and password matches with 
the data then print "login successful" or else if both password and
userName are incorrect then ask user if he want to reset then provide
mobile number . if the mobile number is valid then display the userName
and then redirect him to login page or else print Invalid mobile number
and ask user to enter valid mobile number similarly if userName is only
incorrect then ask him to reset and then redirect to login Same as password.
*/
import java.util.*;
class Instagram
{
	static Scanner sc = new Scanner(System.in);
	private String userName = "Hello";
	private String password = "Hi@123";
	private long phoneNumber = 9123456789L;
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
    	void login()
    	{
    	    System.out.println("Enter your username :");
    	    String enteredUserName = sc.next();
    	    System.out.println("Enter your Passwrod :");
    	    String enteredPassword = sc.next();
    	    Instagram obj = new Instagram();
    	    System.out.println(!obj.getUserName().equals(enteredUserName));
    	    System.out.println(obj.getPassword().equals(enteredPassword));
    	    if(obj.getUserName().equals(enteredUserName) && obj.getPassword().equals(enteredPassword))
    	    {
    	        System.out.println("Login successful");
    	    }
    	    else if(!(obj.getUserName().equals(enteredUserName)) && (obj.getPassword().equals(enteredPassword)))
    	    {
    	        
    	            System.out.println("Invalid UserName");
        	        System.out.println("1.Enter again/n 2.Reset UserName");
        	        int choice = sc.nextInt();
        	        if(choice==1)
        	        {
        	            System.out.println("Enter your userName correctly :");
        	        }
        	        else if(choice==2)
        	        {
        	           System.out.println("Enter your New userName :");
        	           String newUserName = sc.next();
        	           obj.setUserName(newUserName);
        	           System.out.println("UserName changed successfully");
        	        }
    	        }
    	        
    	    }
    	    
    	}
    	public static void main(String[] args)
    	{
            User obj = new User();
            obj.login();
    	}
}



