package _21IOStreams;
//program for understanding the byte output stream,input ,writer,reader
import java.io.*;
public class _8demo 
{
    public static void main(String[] args) throws Exception
    {

        ByteArrayOutputStream bos =new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        bos.writeTo(new FileOutputStream("/home/vjpazhani/JAVA/Myjava/test8.txt"));
        bos.close();
    }
}
/*
 * method 1
 * ByteArrayOutputStream bos =new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[]=bos.toByteArray();

        for(byte x:b)
        {
            System.out.println((char)x);
        }
        bos.close();
 */
