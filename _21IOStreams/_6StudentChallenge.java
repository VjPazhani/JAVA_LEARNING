package _21IOStreams;
import java.io.*;
//program for writing two different file content to single source
public class _6StudentChallenge 
{
    public static void main(String[] args) throws Exception
    {
        try
        (FileInputStream fis1=new FileInputStream("/home/vjpazhani/JAVA/Myjava/source1.txt");
        FileInputStream fis2=new FileInputStream("/home/vjpazhani/JAVA/Myjava/source2.txt");
        FileOutputStream fos = new FileOutputStream("/home/vjpazhani/JAVA/Myjava/destination.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2))
        {
                int b;
                while((b=sis.read())!=-1)
                {
                    fos.write(b);
                }
                
        fis1.close();
        fis2.close();
        fos.close();

        }
    }
    
}
