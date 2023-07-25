package _17ExceptionHandling;

import java.util.Scanner;

public class _1demo{
    public static void main(String ... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number1: ");
        int a=sc.nextInt();        
        System.out.println("Enter the  number2: ");
        int b=sc.nextInt();
        int c;
        sc.close();
        //put the statements inside the try where u guess that exception(Run time error) will occur
        //if u don't use exception jvm will throws the error without execueting the after the exception occured method
        //so we use exception for execueting the statements after exception statements that are no related that exeception
        try{
             c=a/b;
            System.out.println("The divison is "+c);

             
        }
        catch(ArithmeticException e){
            //u can print the statement whatever statement do u want
            //or print the object e
            System.out.println("Dividing the any nunmber by zero ");
            System.out.println(e);
        }
        System.out.println("Bye");
    }
}
