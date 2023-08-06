package _21IOStreams;

import java.io.FileReader;

//program to understand the file reader
//it also same as file input stream but reads charecter that one make difference
public class _3demo 
{
    public static void main(String[] args) throws Exception
    {

        try(FileReader fr=new FileReader("/home/vjpazhani/JAVA/Myjava/test1.java"))
        {
            int x;
            while((x=fr.read())!=-1)
                System.out.print((char)x);
        }
    }
}
