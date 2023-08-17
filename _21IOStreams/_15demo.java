package _21IOStreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//program to write the data into with same datatype using data stream

class Student1
{
    int rollno;
    String name;
    float avg;
    String dept;

}
public class _15demo 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos= new FileOutputStream("/home/vjpazhani/JAVA/Myjava/My/Student2.txt");
        DataOutputStream dos= new DataOutputStream(fos);

        Student1 s=new Student1();
        s.rollno=12;
        s.name="Raj";
        s.dept="It";
        s.avg=50;

        dos.writeInt(s.rollno);
        dos.writeUTF(s.name);
        dos.writeFloat(s.avg);
        dos.writeUTF(s.dept);

        fos.close();
        dos.close();
    }
}
