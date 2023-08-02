package _18MutiThreading;
class ATM{

    synchronized public void checkBalance(String name)
    {
        System.out.print(name+" is Checking ");

        try{Thread.sleep(1000);} 
        catch(Exception e){}
        
        System.out.println("Balance");
    }
   synchronized public void withDraw(String name,int amount)
    {
        System.out.print(name+" withdraw ");

        try{Thread.sleep(1000);} 
        catch(Exception e){}

        System.out.println(amount);
        
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;

        Customer(String n,ATM am,int a)
        {
            name=n;
            atm=am;
            amount=a;
        }
        public void useATM()
        {
            atm.checkBalance(name);
            atm.withDraw(name,amount);
        }
        public void run(){
            useATM();
        }
    
}

public class _6ATMCustomer{
    public static void main(String[]args){
        ATM atm=new ATM();
        Customer c1=new Customer("Jhon",atm,1000);
        Customer c2=new Customer("Smith",atm,10001);
        c1.start();
        c2.start();
    }
}

