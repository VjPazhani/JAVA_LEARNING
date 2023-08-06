package _8Array;
import java.util.*;
public class _10CopyTheArray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of an array: ");
            int s = sc.nextInt();
        int a[]=new int [s];
        int b[]= new int[s];
        int i,j;
        try{for(i=0;i<a.length;i++){
            System.out.printf("Enter the value for array a[%d]:",i);
             a[i]=sc.nextInt();
        }
        sc.close();
    } catch(Exception e){}
        for(i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(i=0;i<a.length;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.println("");
        for(j=0;j<b.length;j++){
            System.out.printf("%d\t",b[j]);
        }
        System.out.println("");
    }
}
