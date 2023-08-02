package _18MutiThreading;
//program to understand the daemon thread and join thread
//daemon thread will stop threaad when program ends
//default the main method waiting for other thread that it uses join method
//if we use daemon thread but we want ohter run the we use the join method it is a method that waits other thread s to finish and joins with the threads

class MyThread1 extends Thread{
    
   /*  1.public void run(){
        int count=1;
        while(true){
            System.out.println(count++);            
          
        }
    }
    */
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +"My thread");            
          
        }
    }
}
public class _4demoDaemonThread {
    //watch the program closely inside  the main method we create object of Thread classs
    //then we start the thread to run the main method is finished '}'
    //note: Main method is the actual method of the application when it stops then the program will finish
    //but here we don't that the main method is finished its part
    //because main method is waiting for other method(thread) is running on other side
    public static void main(String[] args) throws Exception {
        MyThread1 t= new MyThread1();
        //daemon thread is dependent thread if main method is terminated then the thread is terminated
        t.setDaemon(true);
        t.start();
        //2.try{Thread.sleep(1);} catch(Exception e){}
        //how the join method is work
       // Thread mainThread= Thread.currentThread(); //this gives reference to main thread that is mythread1
       // mainThread.join();
        //3.we can use t.join();
        //4.
        int count=1;
        while(true){
            System.out.println(count++ +"MAIN method"); 
            Thread.yield();  
            //yield is used to hold the main method some times and gives more time thread 
            //it gives more CPU time to run the mythread than main method     
          
        }
    }
}
 