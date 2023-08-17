package _21IOStreams;

import java.io.*;

//program to understand the printstream,serialization and write data in file
class Student
{
    int rollno;
    String name;
    String dept;
}

public class _13demo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("/home/vjpazhani/JAVA/Myjava/My/Student1.txt");
        PrintStream ps=new PrintStream(fos);

        Student s=new Student();
        s.rollno=10;
        s.name="Virat";
        s.dept="IT";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

    }
}
