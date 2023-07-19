package _13Interfaces;
interface Member{
    public void callback(); //always use visibility to method in interface
}
class Store{
    Member mem[]= new Member[100];
    int count=0;
    void register(Member m){
        mem[count++]=m;
    }
    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}
class Customer  implements Member{
    String name;
     Customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println(name+" said that he will come");
    }
}

public class ShoppingComplexInterface {
    public static void main(String ...args){
        Store s=new Store();
        Customer c1=new Customer("Jhon");
        Customer c2=new Customer("Raj");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
    
}
