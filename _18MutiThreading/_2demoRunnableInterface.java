package _18MutiThreading;
//build in interface Runnable
//Runnable should not run the thread until we pass the reference of interface to Thread class
//runnable is a another way for multithreadding
class Test implements Runnable{
    //run method abstract method in interface
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+".Hello");
        i++;

        }
    }
}
public class _2demoRunnableInterface {
    
    public static void main(String ...args){
        //to start a thread method
        //first create object of interface
        Test t=new Test();
        //then passing interface reference to Thread class
        Thread th=new Thread(t);
        //we should not call the run method with refrence of interface
        th.start();
        int i=1;
        while(true){
            System.out.println(i+".World");
        i++;

        }
    }
    
}
///---------------- the above program gives the example gives that the object will also run when thread runs--------------------------------------------------
/*
 * public class _2demoRunnableInterface implements Runnable{
 * public void run(){
        int i=1;
        while(true){
            System.out.println(i+".Hello");
        i++;

        }
    }
    public static void main(String ...args){
        //to start a thread method
        //first create object of interface
         _2demoRunnableInterface t=new _2demoRunnableInterface ();
        //then passing interface reference to Thread class
        Thread th=new Thread(t);
        //we should not call the run method with refrence of interface
        th.start();
        int i=1;
        while(true){
            System.out.println(i+".World");
        i++;

        }
    }
    
}
 */
    

