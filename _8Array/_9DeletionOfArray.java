package _8Array;
import java.util.Scanner;

public class _9DeletionOfArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,index,length;
        System.out.print("Enter the length of an array: ");
        length =sc.nextInt();
       
        System.out.print("Enter the index that the value should be delete: ");
        index=sc.nextInt();
        for(i=0;i<length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        } 
        for(i=0;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");
        for(i=index;i<length-1;i++){
           a[i]=a[i+1];
        }
        for(i=0;i<length-1;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");


    }
    
}
