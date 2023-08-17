package _21IOStreams;
//program to understand the random access file
import java.io.*;
public class _11demo 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile ra =new RandomAccessFile("/home/vjpazhani/JAVA/Myjava/test3.txt","rw");
        // 'A','B'
        System.out.println((char)ra.read());
        System.out.println((char)ra.read());
        System.out.println((char)ra.read());
        ra.write('d');

        System.out.println((char)ra.read());
        ra.skipBytes(3);

        System.out.println((char)ra.read());
        ra.seek(3);

        System.out.println((char)ra.read());

        System.out.println(ra.getFilePointer()); 
        ra.seek(ra.getFilePointer()+2);
        System.out.println((char)ra.read());


        ra.close();
    }
}
