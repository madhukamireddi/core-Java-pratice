/*
create a java application where we have a java class as batch
JavaLearners here user need to enter the details of 5 boys and
5 girls then we have method like display which is of non-static
and it displays the details of students,then if user wants to see
boys data then display boys data or else if user wants to see
girls data then display girls data or else if user want to see both
the data then display both.
*/

import java.util.Scanner;
class JavaLearners
{
    static Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    String s4 = sc.next();
    String s5 = sc.next();

    void display() 
    {
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       System.out.println(s5);
    }
    
	public static void main(String[] args) 
	{
	    System.out.println("Enter boys data: ");
        JavaLearners boys = new JavaLearners();
	    System.out.println("Enter girls data: ");
        JavaLearners girls = new JavaLearners();


        System.out.println("Enter which data you want: ");
        String choice = sc.next();
        if(choice.equals("boys"))
        {
            boys.display();
        }
        else if(choice.equals("girls"))
        {
            girls.display();
        }
        else if(choice.equals("both"))
        {
            boys.display();
            girls.display();
        }
        else
        {
            System.out.println("Invalid choice");
        }
        
	}
}

/*
output:
case 1: if user choice ->boys

Enter boys data: 
Madhu
Naveen
Chaitu
Sanjay
Hasan
Enter girls data: 
Divya
Spandhana
Gowthami
Keerthi
Anusha
Enter which data you want: 
boys
Madhu
Naveen
Chaitu
Sanjay
Hasan

case 2: if user choice ->girls

Enter boys data: 
Madhu
Naveen
Chaitu
Sanjay
Hasan
Enter girls data: 
Divya
Spandhana
Gowthami
Keerthi
Anusha
Enter which data you want: 
girls
Divya
Spandhana
Gowthami
Keerthi
Anusha

case 3: if user choice ->both

Enter boys data: 
Madhu
Naveen
Chaitu
Sanjay
Hasan
Enter girls data: 
Divya
Spandhana
Gowthami
Keerthi
Anusha
Enter which data you want: 
both
Madhu
Naveen
Chaitu
Sanjay
Hasan
Divya
Spandhana
Gowthami
Keerthi
Anusha

case 4 : if user choice anohter value

Enter boys data: 
Madhu
Naveen
Chaitu
Sanjay
Hasan
Enter girls data: 
Divya
Spandhana
Gowthami
Keerthi
Anusha
Enter which data you want: 
students
Invalid choice

*/