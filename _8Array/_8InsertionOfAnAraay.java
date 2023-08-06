package _8Array;
import java.util.*;
public class _8InsertionOfAnAraay{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,x,index,length;
        System.out.print("Enter the length of an array: ");
        length =sc.nextInt();
        System.out.print("Enter the value to insert: ");
        x=sc.nextInt();
        System.out.print("Enter the index that the value should be insert: ");
        index=sc.nextInt();
        try{
            for(i=0;i<length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        } 
        sc.close();
    } catch(Exception e){}
        for(i=0;i<length;i++){
            System.out.printf("%d\t",a[i]);
           
        }

        System.out.println("");
        for(i=length-1;i>index;i--){
            a[i+1]=a[i];
            a[index]=x;

        }
        for(i=0;i<length+1;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");
    }

}