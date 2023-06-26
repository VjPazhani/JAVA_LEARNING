package java_problemSolving;

import java.util.Scanner;

public class _4Largest {
    public static void main(String args[]){
        int largest;
        //creating scanner class by using object System.in
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three elements: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        largest = c>(a>b ? a :b) ? c : (a>b ? a : b);
        System.out.println(largest+" is the largest number");
        sc.close();
    }
    
}
