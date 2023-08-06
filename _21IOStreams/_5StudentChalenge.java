package _21IOStreams;
//programm to copying one file content into other file
import java.io.*;
public class _5StudentChalenge
{
    public static void main(String[] args) throws Exception
     {
        try(FileInputStream fis1=new FileInputStream("/home/vjpazhani/JAVA/Myjava/source1.txt");
        FileOutputStream fos = new FileOutputStream("/home/vjpazhani/JAVA/Myjava/source2.txt"))
        {
            int x;
            while((x=fis1.read())!=-1)
            {
                if(x>=65 && x<=90)
                    fos.write(x+32);
                else
                    fos.write(x);
            }
            fis1.close();
            fos.close();

        }
    }
}