package _21IOStreams;
//serialization is the process of writing and readingthe state of object into file 
//it must implements the interface serializable
//it must have default constructer
//it doesn't have any abstract methods
import java.io.*;

//program to read  the data into with same datatype using data stream
class Student2 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data=10;
    public transient int trans;

    public Student2()
    {

    }
    public Student2(int r,String n,float a,String d)
    {
        rollno=r;
         name=n;
        avg=a;
         dept=d;
         data=5050;
        trans=20;
    }
    public String toString()
    {
        return "\nStudent Details"+
                "\nRoll: "+rollno+
                "\nName: "+name+
                "\nAveraage: "+avg+
                "\nDept: "+dept+
                "\nData: "+data+
                "\nTrans: "+trans;

    }

}
public class _18demo 
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fos= new FileInputStream("/home/vjpazhani/JAVA/Myjava/My/Student3.txt");
        ObjectInputStream oos=new ObjectInputStream(fos);

        Student2 s;
        s=(Student2)oos.readObject();

        System.out.println(s);
        fos.close();
        oos.close();
    }
}
