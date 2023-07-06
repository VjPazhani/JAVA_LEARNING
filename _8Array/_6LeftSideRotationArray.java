package _8Array;
import java.util.*;
public class _6LeftSideRotationArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        int i,temp;
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
            a[i]= sc.nextInt();
        }
        temp=a[0];
        for(i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        for(i=0;i<a.length-1;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.printf("%d\t\n",temp);

    }
    
}
