package _10OOPS;

import java.util.Scanner;

class Cylinder{
    public double radius;
    public double height;
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

public class Cylinder1 {
    public static void main(String ... args){
    Scanner SC = new Scanner(System.in);
    Cylinder c= new Cylinder();
    System.out.println("Enter the radius ");
    c.radius=SC.nextDouble(); 
    System.out.println("Enter the height ");
    c.height=SC.nextDouble(); 
    SC.close();
    System.out.println("============= ============= ===========");
    System.out.println("LidArea of cylinder is "+c.lidArea());
    System.out.println("============= ============= ===========");
    System.out.println("Total Surface of Cylinder is "+c.totalSurfaceArea());
    System.out.println("============= ============= ===========");
    System.out.println("Volume Of Cylinder is "+c.volume());
    System.out.println("============= ============= ===========");


    }


}
