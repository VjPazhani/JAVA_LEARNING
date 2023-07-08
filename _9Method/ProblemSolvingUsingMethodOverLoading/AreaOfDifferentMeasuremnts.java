package _9Method.ProblemSolvingUsingMethodOverLoading;

import java.util.Scanner;

public class AreaOfDifferentMeasuremnts {
    //writing method for area of circle
    static double area(double r){
        return Math.PI *(r * r);
    }
    //writing method for area of rectangle
    static double area(double l,double b){
        return (l * b);
    }
    //writing area of parallelogram
    static float area(float b1,float h1){
        return (b1 * h1);
    }
    //writing method for trapezieum;
    static double area(double a,double b,double h){
        /*In Java, when dividing two integers (1/2), the result will be an integer division, which truncates the decimal part and returns only the whole number. In this case, 1/2 equals 0, resulting in an incorrect area calculation.

To fix this, you need to ensure that at least one of the numbers used in the division is a decimal or floating-point value. Here's the corrected code:

 */
        return ((1.0/2.0)*(a+b)*h);
    }
    public static void main(String args[]){
        //getting values from user for calculating the area respectively
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the values of radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle is "+area(r));
        System.out.println("========== =========== ========= ");
        System.out.printf("Enter the values of length: ");
        double l = sc.nextDouble();
        System.out.println("");
        System.out.printf("Enter the values of breadth: ");
        double b = sc.nextDouble();
        System.out.println("");
        System.out.println("Area of rectangle is "+area(l,b));
        System.out.println("========== =========== ========= ");
        System.out.printf("Enter the values of height: ");
        Float h1 = sc.nextFloat();
        System.out.println("");
        System.out.printf("Enter the values of breadth: ");
        Float b1= sc.nextFloat();
        System.out.println("");
        System.out.println("Area of parellelogram is "+area(b1,h1));
        System.out.println("========== =========== ========= ");
        System.out.printf("Enter the values of a ");
        double a = sc.nextDouble();
        System.out.println("");
        System.out.printf("Enter the values of b ");
         double b2 = sc.nextDouble();
        System.out.println("");
        System.out.printf("Enter the values of h ");
         double h = sc.nextDouble();
        System.out.println("");
        System.out.println("Area of trapezium is "+area(a, b2, h));
        System.out.println("========== =========== ========= ");
        sc.close();




    }

}
