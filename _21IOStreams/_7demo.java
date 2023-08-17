package _21IOStreams;
import java.io.*;
//program to   understand the bytearray stream
public class _7demo 
{
    public static void main(String[] args) throws Exception
    {
        byte b[]={'a','b','c','d','e','d'};

        ByteArrayInputStream bis =new ByteArrayInputStream(b);

        String str= new String(bis.readAllBytes());

        System.out.println(str);
        System.out.println(bis.markSupported());
   bis.close();
    }
}

/*1. method1
 *  ByteArrayInputStream bis =new ByteArrayInputStream(b);

        int x;

        while((x=bis.read())!=-1)
        {
            System.out.println((char)x);
        }
        bis.close();
 */

 /*  method 2
  ByteArrayInputStream bis =new ByteArrayInputStream(b);

            String str= new String(bis.readAllBytes());

            System.out.println(str);
       bis.close();
  * method2
  */
