/*
Find length of array without using length variable 
*/
import java.util.Scanner;
class Question3
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) 
    {
        int arr [] = {10,20,30,40,50};
        int i = 0;
        try {
            for(i = 0; i<20; i++)
            {
                System.out.println(arr[i]+" ");
            }
            
        } catch(Exception e) {
            //System.out.println(e);
            System.out.println("Array length is "+i);
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
Array length is 5
*/
