package _21IOStreams;
//program  to understand the reading the data from file
import java.io.*;

//program to understand the printstream,serialization and write data in file
class Student
{
    int rollno;
    String name;
    String dept;
}

public class _14demo 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fos=new FileInputStream("/home/vjpazhani/JAVA/Myjava/My/Student1.txt");
        //upon input stream we can't assign a reader
        //input stream bridges class to connect the buffer reader to input stream
        BufferedReader br = new BufferedReader((new InputStreamReader(fos)));

        Student s=new Student();
        s.rollno=10;
        s.name="Virat";
        s.dept="IT";

        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println("Roll No: " +s.rollno);
        System.out.println("Name: " +s.name);
        System.out.println("Dept :" +s.dept);
        
        br.close();
    }
}
