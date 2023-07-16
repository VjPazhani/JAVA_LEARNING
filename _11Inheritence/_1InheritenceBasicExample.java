package _11Inheritence;
import java.util.*;
class Circle {
    public double radius;
    public  double area(){ //if we put static this method and it throws a error "cannot make aa static reference to naon-static field"
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;
    public double volume(){
        // pi* r * r * h;
        return area() * height;
    }
   
}
public class _1InheritenceBasicExample{
public static void main(String ... args){
    Scanner SC = new Scanner(System.in);
    Cylinder c= new Cylinder();//creating cylinder objects
    System.out.println("Enter the radius ");
    c.radius=SC.nextDouble(); 
    System.out.println("Enter the height ");
    c.height=SC.nextDouble(); 
    SC.close();
    System.out.println("============= ============= ===========");
    System.out.println("LidArea of cylinder is "+c.area()); //using area method from class circle 
    System.out.println("============= ============= ===========");
    System.out.println("Volume Of Cylinder is "+c.volume());
    System.out.println("============= ============= ===========");
    //creating object c1 using class of circle
    //if the see the output circle 
    //it  shows null value
    //got see the line 28 for understanding
    //if dont want see the null try c1.radius=5 this means assining value to object of circle with radius property    
    Circle c1 = new Circle();
    //c1.radius=5
    System.out.println("Area of circle1 is "+c1.area()); //----------important points calling areea method using object of class circle
    System.out.println("Perimeter of circle1 is "+c1.perimeter());
    System.out.println("Perimeter of circle1 is "+c1.circumference());
    System.out.println("============= ============= =============");
}

}