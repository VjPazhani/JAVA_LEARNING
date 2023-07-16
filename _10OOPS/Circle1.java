package _10OOPS;
//this not a ordinary program please understand the program by line by line
//if you creating a class as a public the it should have its own filename
//first of we create a filename called "Circle1" note this
//--------important -------and we create another class 'Circle' and it does not create as public
//when we compile this file the compiler create two seprate class ------when there are so many class files are there java will create seprate class file for each 
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
    public class Circle1{
    public static void main(String...args){
        System.out.println("Enter the radius of c1 ");
        Scanner sc = new Scanner(System.in);
        //creating object for WritingClassOfcircle like creating scanner object usin scanner class
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.radius=sc.nextDouble(); //we declare radius as public so we call the radius by using object and assing the values
        System.out.println("Enter the radius of c2 ");
        c2.radius=sc.nextDouble();
        sc.close();
        //try to put Circle instead of c1
        System.out.println("Area of circle1 is "+c1.area()); //----------important points calling area method using object of class circle
        System.out.println("Perimeter of circle1 is "+c1.perimeter());
        System.out.println("Perimeter of circle1 is "+c1.circumference());
        System.out.println("============= ============= =============");
        System.out.println("Area of circle2 is "+c2.area());
        System.out.println("Perimeter of circle2 is "+c2.perimeter());
        System.out.println("Perimeter of circle2 is "+c2.circumference());


    } 

}
