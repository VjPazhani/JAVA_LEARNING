package _21IOStreams;
//program to understand the  file handling
import java.io.*;
public class _12demo 
{
    public static void main(String[] args) throws Exception
    {
        File f=new File("/home/vjpazhani/JAVA/Myjava/source1.txt");

       // f.setReadOnly();
       f.setWritable(true);
        FileOutputStream fo=new FileOutputStream("/home/vjpazhani/JAVA/Myjava/source1.txt");
        
        fo.close();
       
    }
}
/*
 * 1.
 * for(String x:List)
        {
             System.out.println(x);
            
        }
 */

 /*
  * 2. for(File x:List)
        {
             System.out.println(x);
             System.out.println(f.getPath());
             System.out.println(f.getParent());
             
            
        }
  */
