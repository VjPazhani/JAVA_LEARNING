package _11Inheritence;

class Account{
    private String acc_no;
    private String name;
    private String dob;
    private String address;
    private long phone;
    protected long balance;
    //try to put same variable in constructer parameter
    public Account(String acc,String name,String add,String dob,long phone,long bal){

        acc_no=acc;
        this.name=name;
        this.dob=dob;
        address=add;
        this.phone=phone;
        balance=bal;

    }
    public String getAcc(){return acc_no;}
    public String getName(){return name; }
    public String getDob(){return dob;}
    public String getAddress(){return address;}
    public long getPhone(){return phone;}
    public long getBalance(){return balance;}


    public void setName(String name){this.name=name;}
    public void setAddress(String add){this.address=add;}

    public long balanceCheck(){
        return balance;
        
    } 
    
}
class SavingAccount extends Account{
    public long amt;
    public SavingAccount(String acc, String name, String add, String dob, int phone, long bal) {
        super(acc, name, add, dob, phone, bal);
    }
    
    public void depositAmount(long amt){
         balance+=amt;
    }
    public void withdraw(long amt){
         balance-=amt;
    }
   
}
class LoanAccount extends Account{
    public LoanAccount(String acc, String name, String add, String dob, long phone, long bal) {
        super(acc, name, add, dob, phone, bal);
    }
    public void payemi(long amt){
        balance-=amt;
    }
    public void repay(long amt){
        if(balance==amt){
            balance=0;
        }
    }

}
public class _2InheritenceBankAccount{
    public static void main(String args[]){
        
    }

}