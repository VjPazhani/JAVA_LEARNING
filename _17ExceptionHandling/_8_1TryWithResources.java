package _17ExceptionHandling;
//try with resources means that the try block will managing the closing the resources like file and scanner
import java.io.*;
import java.util.*;
public class _8_1TryWithResources {

    static void Divide() throws Exception{
        try(FileInputStream fi= new FileInputStream("/home/vjpazhani/JAVA_LEARNING/my.txt");Scanner sc =new Scanner(fi);){
       int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/b); 
        System.out.println(a/c); 
        }
    }
public static void main(String[]args) throws Exception{
        try{ //if it is catch exception it will stop the process and keeps resource open then X is printed
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
       //1. int x= sc.nextInt();
        //.System.out.println(x);
}
    
}
