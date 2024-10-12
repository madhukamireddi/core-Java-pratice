/*
create a java application where we need to handle IndexOutOfBoundsException 
*/
import java.util.Scanner;
class Question2
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        int arr [] = {10,20,30,40,50};
        try {
            for(int i = 0; i<10; i++)
            {
                System.out.println(arr[i]+" ");
            }
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
/*
output:
10 
20 
30 
40 
50 
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
*/
