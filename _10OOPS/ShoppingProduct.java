package _10OOPS;
class Product{
    private String  item_no;
    private int quantity;
    private double price;
    private String name;

    public String getItem(){
        return item_no;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
   public void setQuantity(int q){
    quantity=q;
   }
   public void setPrice(double p){
        price=p;
   }
    public Product(String i){
    item_no=i;
   }
   public Product(String i,String n){
    item_no=i;
    name=n;
   }
   public Product(String i,String n,int q,double p){
    item_no=i;
    name=n;
    quantity=q;
    price=p;



   }

}
public class ShoppingProduct {
    
}
