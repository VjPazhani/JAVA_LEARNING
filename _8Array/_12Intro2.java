package _8Array;

import java.util.Scanner;

public class _12Intro2 {
    public static void main(String args[]){
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the size of row: ");
        //row act as a reference of array
        int r =sc.nextInt();
        System.out.printf("Enter the size of column: ");
        //column is used store elemrnts of array
        int c =sc.nextInt();
        //2d array declaration
        int a[][]=new int[r][c];
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
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
        int k,l;
        Scanner Sc =new Scanner(System.in);
        System.out.printf("Enter the size of row: ");
        //row act as a reference of array
        int m=Sc.nextInt();
        System.out.printf("Enter the size of column: ");
        //column is used store elemrnts of array
        int n=Sc.nextInt();
        //2d array declaration
     
        int b[][]=new int[m][n];
        for(k=0;k<b.length;k++){
            for(l=0;l<b[0].length;l++){
            System.out.printf("Enter the value of array b[%d][%d]: ",k,l);

                b[k][l]= Sc.nextInt();
            }
        }
       
        for( int x[]:b){
            for(int y:x){
                System.out.printf("%d\t",y);
            }
            System.out.println("");

        }

    }
    
    }
    

