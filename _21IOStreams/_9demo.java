package _21IOStreams;
//program to understanding buffered input,output,writer and reader
import java.io.*;

public class _9demo 
{
 public static void main(String[] args) throws Exception
    {
        //4.
        FileReader fi = new FileReader("/home/vjpazhani/JAVA/Myjava/source1.txt");
    
        BufferedReader bus=new BufferedReader(fi);
    
        System.out.print((char)bus.read());
        System.out.print((char)bus.read());
        bus.mark(10); //how long that mark is to be valid -10 letters
        
        System.out.print((char)bus.read());
        System.out.print((char)bus.read());
        bus.reset();

        System.out.print((char)bus.read());
        System.out.print((char)bus.read());

        //reader provides read line
        System.out.print(bus.readLine());
        bus.close();
        
    }   
}

/* 
    //1.

    FileInputStream fi = new FileInputStream("/home/vjpazhani/JAVA/Myjava/source1.txt");
    BufferedInputStream bus=new BufferedInputStream(fi);
    int x;
    while((x=bus.read())!=-1)
    {
        System.out.print((char)x);
    }
    bus.close(); */

/*
 * 2.
 * System.out.println(fi.markSupported());
    System.out.println(bus.markSupported());
    bus.close();
 */

 /*//3.understanding mark
        FileInputStream fi = new FileInputStream("/home/vjpazhani/JAVA/Myjava/source1.txt");
    
        BufferedInputStream bus=new BufferedInputStream(fi);
    
        System.out.print((char)bus.read());
        System.out.print((char)bus.read());
        bus.mark(10); //how long that mark is to be valid -10 letters
        
        System.out.print((char)bus.read());
        System.out.print((char)bus.read());
        bus.reset();

        System.out.print((char)bus.read());
        System.out.print((char)bus.read());
  * 
  */