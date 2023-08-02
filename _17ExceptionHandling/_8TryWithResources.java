package _17ExceptionHandling;
//using file in the program called resources
import java.io.*;
import java.util.*;
public class _8TryWithResources  {
    static FileInputStream fi;
    static Scanner sc;
    static void Divide() throws Exception{
        fi= new FileInputStream("/home/vjpazhani/JAVA_LEARNING/my.txt");
        //see the file for value
        sc=new Scanner(fi);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/b); 
        System.out.println(a/c); //replace c with b
        fi.close();
        sc.close();//important point
        //so close ressources properly by using finally
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
