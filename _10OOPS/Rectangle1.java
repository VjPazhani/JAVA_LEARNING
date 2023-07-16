package _10OOPS;
//compile this file to understand the idea of class file
import java.util.Scanner;

class Rectangle {
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
    //------------------------ important note-------------------
    public boolean isSquqre(){
        if(length==breadth)
            return true;
        else
            return false;
    }

}
//filename == Reactangle1
public class Rectangle1{
    public static void main(String ... args){
        //creating object of rectangle class
        Rectangle R = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        R.length=sc.nextDouble();
        System.out.println("Enter the breadth : ");
        R.breadth=sc.nextDouble();
        sc.close();
        System.out.println("========== ========== =============");
        System.out.println("Area is "+R.area());
        System.out.println("========== ========== =============");
        System.out.println("Perimeter is "+R.perimeter());
        System.out.println("========== ========== =============");
        System.out.println("It is Square - "+R.isSquqre());



    }
}
