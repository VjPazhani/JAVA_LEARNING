package _21IOStreams;
//program to understand the input stream
import java.io.*;
public class _2demo 
{
    public static void main(String[] args) throws Exception
    {
         try(FileInputStream fis=new FileInputStream("/home/vjpazhani/JAVA/Myjava/test.java"))
        {
        int x;

            while((x=fis.read())!=-1) //watch it carefully
                System.out.print((char)x);

           
        }
        
}
}

/* 1.
 * try(FileInputStream fis=new FileInputStream("/home/vjpazhani/JAVA/Myjava/test.java"))
        {
            byte b[]=new byte[fis.available()];

            fis.read(b);

                        String str =new String(b);
                        System.out.println(str);
                        fis.close();
        }
        
*/

/* 2. do
            {
                x=fis.read();
                if(x!=1) //see tho output for underatanding

                System.out.print((char)x);
                //when file ends it will be -1
            }while(x!=-1);
 * 
 */
        
    





