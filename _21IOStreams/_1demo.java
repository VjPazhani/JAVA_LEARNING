package _21IOStreams;
//writing output streams
//1.impoort io package
import java.io.*;
public class _1demo 
{
    public static void main(String[] args) throws Exception
    {
       //3.use try block to avoid exeception while at run time
       try{
        //2.Create a file using class filroutoutstream
        FileOutputStream fos = new FileOutputStream("/home/vjpazhani/JAVA/Myjava/test.java");
    
        //4.declaring string object
        String str="Learn Java Programming";
        //5.convert string into bytes because stream supports bytes and it convert into int because byte comes into integrsl type
            //fos.write(str.getBytes());
        //6.under standing reader method with offfset and 
          fos.write(str.getBytes(), 6, str.length()-6);
          //writing bytes into file
          byte b[]=str.getBytes();
          for(byte x:b)
            fos.write(x);

          fos.close();
        
    }
    catch(Exception e){System.out.println(e);}
}
}


/*
 * try with resources
 *  //3.
       try{
        try (//2.
        FileOutputStream fos = new FileOutputStream("/home/vjpazhani/JAVA/Myjava/test.java")) {
        }
        //4.
        String str="Learn Java Programming";
        //5.
            //fos.write(str.getBytes());
        //6.
          //  fos.write(str.getBytes(), 6, str.length()-6);
    }
    catch(Exception e){System.out.println(e);}
 * 
 */