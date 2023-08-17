
package _21IOStreams;

import java.io.*;


class Student1
{
    int rollno;
    String name;
    float avg;
    String dept;

}
public class _16demo 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis= new FileInputStream("/home/vjpazhani/JAVA/Myjava/My/Student2.txt");
        DataInputStream dis= new DataInputStream(fis);

        Student1 s=new Student1();
        //written in same order
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.avg=dis.readFloat();

        s.dept=dis.readUTF();

        

        System.out.println("Roll No: " +s.rollno);

        System.out.println("Name: " +s.name);
        System.out.println("Average: " +s.avg);

        System.out.println("Dept :" +s.dept);

        fis.close();
        dis.close();
    }
}
