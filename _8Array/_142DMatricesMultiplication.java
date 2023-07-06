package _8Array;
import java.util.*;
public class _142DMatricesMultiplication {
    public static void main(String args[]){
        int i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of row: ");
        //row act as a reference of array
        int r =sc.nextInt();
        System.out.printf("Enter the size of column: ");
        //column is used store elemrnts of array
        int c1 =sc.nextInt();
        //2d array declaration
        int a[][]=new int[r][c1];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
            System.out.printf("Enter the value of array a[%d][%d]: ",i,j);
                a[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println("");
        }
     
        int b[][]=new int[r][c1];
        for(i=0;i<b.length;i++){
            for(j=0;j<b[0].length;j++){
            System.out.printf("Enter the value of array b[%d][%d]: ",i,j);
                b[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<b.length;i++){
            for(j=0;j<b[i].length;j++){
                System.out.printf("%d\t",b[i][j]);
            }
            System.out.println("");
        }
        System.out.println("------------- ---------- ---------");
        System.out.println("The Multiplication of two matrices: ");
            int c[][]=new int[r][c1];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                c[i][j]=0;
            for(k=0;k<a.length;k++){

                c[i][j]+=a[i][k]*b[k][j];
            }
            }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.println("");
        }
        


    }
    
}
