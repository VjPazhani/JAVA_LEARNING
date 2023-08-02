package _17ExceptionHandling;

//propogation of exeception
//i can use this exeception used in anywhere
public class _4UncheckedExeception {
    static void fun1(){
        try{
        System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
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
