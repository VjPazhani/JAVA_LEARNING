package java_problemSolving;

import java.util.Scanner;

public class _5QuadraticEquation {
        public static void main(String args[]){
            double discriminant,root1,root2,real,imaginary;
            //creating scanner class
            Scanner sc = new Scanner(System.in);
            //getting three vlaues as if quadratic equation have three contain three variable
            System.out.print("Enter the value of a: ");
            double a = sc.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = sc.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = sc.nextDouble();
            discriminant = b * b - 4 * a *c;
            //discriminant greater than zero
            if(discriminant>0){
                //two real and distinct roots
                root1 = (-b + Math.sqrt(discriminant))/(2 * a);
                root2 = (-b - Math.sqrt(discriminant))/(2 * a);
                System.out.format("root1 = %.2f and root2 = %.2f\n",root1,root2);
            }
            //discriminant eqauls to zero
            else if(discriminant==0){
                //two real and equal roots
                root1 = -b/(2 * a);
                System.out.format("root1 = root2 = %.2f\n",root1);
            }
            //discrimant less than zero
            else{
                //roots are complex and different
                real = -b/(2 * a);
                imaginary = Math.sqrt(-discriminant) / (2 * a);
                System.out.format("root1 = %.2f - %.2fi\n",real,imaginary);
                System.out.format("root1 = %.2f + %.2fi\n",real,imaginary);

            }
            sc.close();

            /*important notes
                1.  discriminant b * b - 4 * a * c;
                2.  Math.sqrt(discriminant)/(2 * a)  
                3.  equal roots = -b / (2 * a);
                4.  imaginary = Math.sqrt(discriminant) / (2 * a);  
             */




        }
}
