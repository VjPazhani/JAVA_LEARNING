package _8Array;

import java.util.Scanner;

public class _2SumElementsInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the size of an array: ");
        int s = sc.nextInt();
        int a[]= new int [s];
        int i,sum=0;
        for(i=0;i<a.length;i++){
            System.out.printf("ENter the value of array a[%d]: ",i);
            a[i]=sc.nextInt();
        }

        for( i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum is "+sum);
        sc.close();

    }
    
}
