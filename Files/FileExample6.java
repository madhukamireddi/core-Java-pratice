/*Serialization example */
import java.io.*;
class Student implements Serializable
{
    private int stuId;
    private String stdName;
    private int stdMarks;
   Student(int stuId,String stdName,int stdMarks)
    {
        this.stuId = stuId;
        this.stdName = stdName;
        this.stdMarks = stdMarks;
    }
    int getId()
    {
        return stuId;
    }
    String getName()
    {
        return stdName;
    }
    int getMarks()
    {
        return stdMarks;
    }

}
class  FileExample6
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\JAVA\\Files in java\\student.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s1 = new Student(101, "Madhu", 81);
        oos.writeObject(s1);
        oos.writeObject(new Student(102,"Naveen",87));
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try 
        {
            while(true)
        {
		
        	Student obj1 = (Student) ois.readObject();
            System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getMarks());
        }
            
        } 
        catch (Exception e) 
        {
            System.out.println("File End.");
        }
        
        // System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getMarks());

        ois.close();


    }
}