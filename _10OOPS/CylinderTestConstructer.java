package _10OOPS;

import java.util.Scanner;

class Cylinder2{
    private double radius;
    private double height;


//creating constructers for class cylinder
public  Cylinder2(){
    radius =1;
    height =1;
}
public  Cylinder2(double r,double h){
    radius=r;
    height=h;   
}
//creatin get and set method;
public double getRadius(){
    return radius;
}
public double getHeight(){
    return height;
}
public void setRadius(double r){
    radius =r;
}
public void setHeight(double h){
    height=h;
}
//important note- if both radius and height return why you write getDimensions so don't create getDiensions just create setDimensions
public void setDimensions(double r,double h){
    radius=r;
    height=h;
} 
//--------------------- -------------- method definition area-----------------------------
public double lidArea(){ //cylinder have circle lid so calculating area of circle
    return Math.PI * radius * radius;
}
public double totalSurfaceArea(){//cylinder comprises drum and circle lid
    //2*pi*r*(h+r)
    //formula is 2*pi*r*r + 2*pi*r*h = 2 * lidarea() * circumference* height
    return 2*lidArea()+circumference() * height;
 }
public double volume(){
    // pi* r * r * h;
    return lidArea() * height;
}
public double circumference(){
    return 2 * Math.PI * radius;
}
}

public class CylinderTestConstructer {
    public static void main(String []args){
        //creating parameterized
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the radius ");
        double  r=SC.nextDouble(); 
        System.out.println("Enter the height ");
        double h=SC.nextDouble();
        SC.close();
        Cylinder2 c=new Cylinder2(r,h);
        System.out.println("============= ============= ===========");
        System.out.println("LidArea of cylinder is "+c.lidArea());
        System.out.println("============= ============= ===========");
        System.out.println("Total Surface of Cylinder is "+c.totalSurfaceArea());
        System.out.println("============= ============= ===========");
        System.out.println("Volume Of Cylinder is "+c.volume());
        System.out.println("============= ============= ===========");
        System.out.println("The length of radius "+c.getRadius());
        System.out.println("============= ============= ===========");
        System.out.println("The lenght of height "+c.getHeight());
        System.out.println("============= ============= ===========");






    }
}
