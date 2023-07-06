//program for jaged array
package _8Array;
import java.util.*;
public class _12IntroJaggedArray3 {
    public static void main(String args[]){
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of row: ");
        //row act as a reference of array
        int r =sc.nextInt();
        System.out.printf("Enter the size of column: ");
       
        //2d array declaration
        int a[][]=new int[r][];
        for(i=0;i<a.length;i++){
            System.out.printf("Enter the row array size a[%d]: ",i);
            int c=sc.nextInt();
            int a[]=new int[c];
            for(j=0;j<a[i];j++){
            System.out.printf("Enter the value of array a[%d][%d]: ",i,j);
                a[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println("");
        }
    
}
} 
