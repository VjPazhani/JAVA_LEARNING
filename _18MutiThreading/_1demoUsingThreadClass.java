package _18MutiThreading;
//achieving multithreading using two class
//understanding the control flow single program
//declare class class_name extends Thread
class Test1 extends Thread{
    //Default method to run a thread is run() so we have to override this
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+".Hello");
        i++;

        }
    }
}
public class _1demoUsingThreadClass {
    public static void main(String ...args){
        //to start a thread method
        Test1 t=new Test1();
        //we should not call the run method
        t.start();
        int i=1;
        while(true){
            System.out.println(i+".World");
        i++;

        }
    }
    
}
/*==================== =============================== =============================== ===============================
    //achieving multithreading usin one class
public class _1demoUsingThreadClass extends Thread{
    //Default method to run a thread is run() so we have to override this
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+".Hello");
        i++;

        }
    }
    public static void main(String ...args){
        //to start a thread method
        _1demoUsingThreadClass t=new _1demoUsingThreadClass();
        //we should not call the run method
        t.start();
        int i=1;
        while(true){
            System.out.println(i+".World");
        i++;

        }
    }
    
} */
