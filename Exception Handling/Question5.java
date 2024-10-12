/*
where we take command line arguments from the user
and then add all values and display total sum if 
any Exception occurs handle it.
*/
import java.util.Scanner;
class Question5
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        int sum = 0;
        try {
            for(int i = 0; i<args.length; i++)
            {
                sum = sum + Integer.parseInt(args[i]);
            }
		System.out.println(sum);
        } catch(Exception e) {	    
            System.out.println(e);
        }
    }
}
/*
case 1: if exception not occurs

compile : javac Question5
run     : java Question5 10 20 30

output:
60

case 2: if exception occurs

compile : javac Question5
run     : java Question5 10 20 hello

output:
java.lang.NumberFormatException: For input string: "hello"

*/

