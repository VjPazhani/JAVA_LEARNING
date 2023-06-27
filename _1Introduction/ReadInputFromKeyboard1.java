package _1Introduction;

//Addition of two numbers
import java.util.*;
public class ReadInputFromKeyboard1 {
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int a,b,c;
    System.out.print("Enter the value of a: ");
       a = s.nextInt();
    System.out.print("Enter the value of b: ");
       b = s.nextInt();
       c = a + b;
    System.out.println("Addition of a and b is "+c);
    s.close();

   }
}
