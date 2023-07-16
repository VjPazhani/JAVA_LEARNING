package _10OOPS;
import java.util.*;
//write class Rectangle instead Rectangle3 it gives error like method error
class Rectangle3 {
    //Usually data is hidden and there methods are visible and operation are performed upon on data
    //How to set a value to variable that are private
    private double length;
    private double breadth;
    //get and set property methods
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
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
    //------------------------ important note-------------------
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }

}

public class RectangleDataHiding {
    public static void main(String ... args){
        //creating object of rectangle class
        Rectangle3 r= new Rectangle3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        //-----------------important point--------------
        double l=sc.nextDouble();
        r.setLength(l);
        System.out.println("Enter the breadth : ");
        //important point
        double b=sc.nextDouble();   
        r.setBreadth(b);
        sc.close();
        System.out.println("========== ========== =============");
        System.out.println("Area is "+r.area());
        System.out.println("========== ========== =============");
        System.out.println("Perimeter is "+r.perimeter());
        System.out.println("========== ========== =============");
        System.out.println("It is Square - "+r.isSquare());
        System.out.println("========== ========== =============");
        System.out.println("Read And Writable property");
        System.out.println("Reading the Length "+r.getLength());
        System.out.println("Reading the Breadth "+r.getBreadth());

        





    }
}
