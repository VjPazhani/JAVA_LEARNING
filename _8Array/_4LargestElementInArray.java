package _8Array;
import java.util.*;

public class _4LargestElementInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,max;
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        }
        max=a[0];
        for(int x:a){ //you can use for loop for traversing array
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);
    
}
}
