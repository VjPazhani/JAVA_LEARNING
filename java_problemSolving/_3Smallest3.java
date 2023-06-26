package java_problemSolving;

import java.util.Scanner;

public class _3Smallest3 {
    public static void main(String args[]){
        int smallest;
        //creating scanner class using object System.in
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number c: ");
        int c = sc.nextInt();
        smallest = c<(a<b?a:b) ? c:(a<b?a:b);
        System.out.println(smallest+ " is the smallest number ");
        sc.close();
        



    }
    
}
