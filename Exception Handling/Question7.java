/*
we have to take input from the user and print it if any
exception occurs then handle it and again ask another input
from the user until user gives correct input.
*/
import java.util.Scanner;
class Question7
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        while(true)
        {
             try {
                int a =sc.nextInt();
                break;
                } catch(Exception e) {
                    System.out.println("Enter a valid input:");
                    sc.next();
                }
        }
    }
}