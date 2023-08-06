package _8Array;
import java.util.*;

public class _5SecondLargestElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,max1,max2;
        try{
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        }
        sc.close();
    }catch(Exception e){}
        max1=max2=a[0];
        
        for(i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println(max2);

    }
    
}
