package java_problemSolving;
import java.util.Scanner;

public class _1OddEven1 {
    public static void main(String args[]){
        //creating a scanner object by using Scanner class and System.in object
        Scanner sc = new Scanner(System.in);
        //get input value from user
        System.out.print("Enter the number to be checked: ");
        int num = sc.nextInt();
        if(num%2==0)
        System.out.println("The number is Even ");
        else
        System.out.println("The number is Odd ");
        sc.close();
    }
    
}
