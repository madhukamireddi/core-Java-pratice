/*
create a java application where we have a java class JavaDevolpers
it contains a global variable attendance and a non-static method 
programming having attendance as parameters and another non-static
method core java having attendance as parameter then if core java
attendance is greater than programming and total attendance return
"Good job, keep it up" or else if core java attendance is less than
programming attendance return "change the batch".

*/
import java.util.Scanner;

class Question2 
{
    static Scanner sc = new Scanner(System.in);
    float attendance ;
    
    float programming(float attendance)
    {
        return attendance;
    }
    String corejava(float attendance)
    {
        System.out.println("Enter programming attendance: ");
        float proattendance = programming(sc.nextFloat());
        this.attendance = (attendance+proattendance)/2;
        if(attendance > proattendance && attendance > this.attendance)
        {
            return "Good job, keep it up";
        }
        else
        {
            return "Change the batch";
        }
    }
    
   public static void main(String[] args) 
   {
       Question2 obj =  new Question2();
       System.out.println("Enter core java attendance");
       System.out.println(obj.corejava(sc.nextFloat()));
       
       
   }

}

/*
output:

case 1: 
Enter core java attendance
78.46
Enter programming attendance: 
56.45
Good job, keep it up

case 2:
Enter core java attendance
60
Enter programming attendance: 
70
Change the batch
*/
