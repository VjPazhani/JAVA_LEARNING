package _18MutiThreading;
 class Mydata{
    public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        } 

    }
}
class Mythread_1 extends Thread{
    Mydata d1;
    Mythread_1(Mydata dat){
        d1=dat;
    }
   public void run(){
        d1.display("Hello World to java programming");
    }
}
class Mythread_2 extends Thread{
    Mydata d2;
    Mythread_2(Mydata dat){
        d2=dat;
    }
    public void run(){
        d2.display("Welcome");
    }
}
public class _5demoForSynchronize {
    public static void main(String[]args){
        Mydata dd=new Mydata();//shared object
        Mythread_1 t1=new Mythread_1(dd);
        Mythread_2 t2=new Mythread_2(dd);
        t1.start();
        t2.start();
    }
    
}
