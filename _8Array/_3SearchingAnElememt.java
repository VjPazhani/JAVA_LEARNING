//program for searching an element and print out that element
package _8Array;
import java.util.Scanner;

public class _3SearchingAnElememt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array a: ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i;
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
            
        }
        System.out.print("Enter the value to search: ");
        int X = sc.nextInt();
        sc.close();
        for(int x:a){
            if(x==X){
                System.out.println(X+ " is present");
                System.exit(0); //break is not work in java
            }
        }
        System.out.println("Not found");

    }
    
}
