package _21IOStreams;
import java.io.*;
public class StudentChallenge1 
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fo=new FileOutputStream("/home/vjpazhani/JAVA/Myjava/My/list.txt");
        DataOutputStream dos=new DataOutputStream(fo);

        float list[]={2.44f,1.22f,3.33f,4.33f,5.35f};

        dos.writeInt(list.length);
        for(float x:list)
        {
            dos.writeFloat(x);
        }
        dos.close();
        fo.close();

        FileInputStream fis=new FileInputStream("/home/vjpazhani/JAVA/Myjava/My/list.txt");
        DataInputStream dis=new DataInputStream(fis);
        float data;
        int length1=dis.readInt();
        for(int i=0;i<length1;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
}
