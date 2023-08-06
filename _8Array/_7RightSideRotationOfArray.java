package _8Array;
import java.util.*;
public class _7RightSideRotationOfArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,temp;
        try{
            for(i=0;i<a.length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        }
        sc.close();
    } catch(Exception e){}
        temp=a[a.length-1];
        for(i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        System.out.printf("%d\t",temp);

        for(i=1;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");

    }
}