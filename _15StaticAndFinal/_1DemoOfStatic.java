package _15StaticAndFinal;
//try to understand it
import java.util.Scanner;

//u can define class as static but you can declare staic class inside class
class HondaCity{
    static double price =1000000.00;
    //for understanding the static  members;
    static int a =10;
    int b =40;
    //deeclaring non static method
    void show(){
        //u can access static and static data member in non static field
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
    static void show1(){
        //u can access only static data member
        System.out.println("The value of a is "+a);
        //System.out.println("The value of b is "+b);

    }
    static double onRoadPrice(String city){

        switch (city) {
            case "chennai":
                return price+price*0.1;
            case "delhi":
                return price + price*0.6;
            case "mumbai":
                return price + price*0.9;
             case "kolkatta":
                return price + price*0.8;
            default:
                return 0;
        }
    }

}
public class _1DemoOfStatic {
    public  static  void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the city to check price: ");
        String city=s.nextLine();
        HondaCity hc = new HondaCity();
        HondaCity hc1 = new HondaCity();
        System.out.printf("The price of car in %S is %f\n",city,HondaCity.onRoadPrice(city));
        s.close();
        //printing the static value and static value
        hc.show();
        //suppose I change the value of static X and non static Y
        hc.a=20;
        hc.b=20;
        //but it print same b value and different a value
        //because the a is static and it used all object that are same
        hc1.show();

    }
    
}
