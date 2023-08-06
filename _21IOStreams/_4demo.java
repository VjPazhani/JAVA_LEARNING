package _21IOStreams;
//porgram to understand the file writer 
//1.import he package
import java.io.*;;
public class _4demo 
{
    public static void main(String[] args) throws Exception//2. file reader throws io exeception so it is neecessary caught
    {
        try(FileWriter fw=new FileWriter("/home/vjpazhani/JAVA/Myjava/test1.java") )
        {
            String str= "Understanding java file writer";
        byte []b=str.getBytes();
        for(byte x:b)
        {
            fw.write(x);

        }
        fw.close();
        }
        
    }
}
