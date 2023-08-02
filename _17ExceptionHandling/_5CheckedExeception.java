package _17ExceptionHandling;
//checked exeception
//1.import java.io.*;
class Lowbalance extends Exception{ //we inherited the exeception so we handled the exeception
    public String toString(){
        return "Balance should not below 4000";
    }
}
public class _5CheckedExeception {
    static void fun1(){
        //2.FileInputStream fi = new FileInputStream("My.txt");
        try{
            throw new Lowbalance();
        }
        catch(Lowbalance e){
            System.out.println(e); // System.out.println(e.getstring);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String ... e){
        fun3();
    }
    
}
