import java.lang.*;
import java.util.*;
import java.io.*;

class Student implements Serializable //must implement Serializable interface
{
    int rollNo;
    String name;
    String course;
    
    //this must be present
    Student()
    {
        
    }
}

class Main
{
    public static void main(String args[]) throws Exception
    {  
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Rishabh";
        s1.course = "CSE";
        
        //Writing
        FileOutputStream fos = new FileOutputStream("Student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        try 
        {
            oos.writeObject(s1);
        }
        catch (NotSerializableException e)
        {
            System.out.println(e);
        }
        
        
        //Reading
        FileInputStream fis = new FileInputStream("Student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = new Student();
        
        s2 = (Student)ois.readObject();   
        System.out.println(s2.rollNo + " " + s2.name + " " + s2.course);
    }
}
