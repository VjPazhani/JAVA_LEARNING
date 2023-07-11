package _8Array;
import java.util.*;
public class _11ReverseCopyAnArray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of an array: ");
            int s = sc.nextInt();
        int a[]=new int [s];
        int b[]= new int[s];
        int i;
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the value for array a[%d]:",i);
        sc.close();

        }

        for(i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(i=0;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");
        for(i=b.length-1;i>=0;i--){
            System.out.printf("%d\t",b[i]);
        }
        System.out.println("");
    }
    
}
