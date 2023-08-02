package _18MutiThreading;
//from 1 to 4 constructors for interface and inheritance
 /*2.class Myrun implements Runnable{
    public void run(){}
}*/
/*3.class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
}
*/
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        //2.setPriority(Thread.MIN_PRIORITY+2);
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
            Thread.sleep(1000); //inside the thread method it throws error so it must be caught so we handled exception
            }
            catch(InterruptedException e){
                System.out.println(e);

            }
        }
    }
}

public class _3demoMethodsOfThreadClass {
     public static void main(String[] args) throws Exception {
        //1.Thread t=new Thread(new Myrun(),"My Name"); //new Myrun() is anonymous class 
        //4.MyThread my= new MyThread("My thread");
        MyThread t=new MyThread("My thread 1");
       /* 2.System.out.println("Id is "+t.getId());
        System.out.println("Name is "+t.getName());
        System.out.println("Priority is "+t.getPriority());
        //1.t.start();
        System.out.println("State is "+t.getState());
        System.out.println("Alive is "+t.isAlive());
        */ 
        t.start();
        t.interrupt();
    }
}

