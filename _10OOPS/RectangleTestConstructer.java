package _10OOPS;
import java.util.*;
//Constructer is a method of class which is automatically constructer when creating object
//when object is created which haven't any constructer it set default constructer;
//constructer can be created as parameter constructer and non-parameter constructer
//constructer should not have any return type so it will be defined as void
//Method overloading is also applicable to constructer,that means you can create so many constructer
//two types of constructer - public,private
 class RectangleTest {
    private double length;
    private double breadth;
    public RectangleTest(){//this is a constructer
            length=1;
            breadth=1;
    }
    public  RectangleTest(double l){
        length=breadth=l;
        
    }
    public  RectangleTest(double l,double b){
        length=l;
        breadth=b;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        if(l>0)
            length=l;
        else
            length =0;
    }
    public double getBreadth(){
        return  breadth;
    }
    public void setBreadth(double b){
        if(b>0)
            breadth=b;
        else
            breadth =0;
    }
    public double area(){
        return length *breadth;
    }
    public double perimeter(){
        return 2 * (length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else 
            return false;
        }

   
    
}
    public class RectangleTestConstructer{
        public static void main(String[]args) {
           //creating parameterized constructer
        Scanner SC = new Scanner(System.in);
           
            System.out.println("Enter the radius ");
             double l=SC.nextDouble(); 
            System.out.println("Enter the height ");
            double b=SC.nextDouble();
            RectangleTest r=new RectangleTest(l,b);
            SC.close();

            System.out.println("Area is "+r.area());
            System.out.println("Perimeter is "+r.perimeter());
            System.out.println("IT is Square : "+r.isSquare());
          

        }

    
    }

