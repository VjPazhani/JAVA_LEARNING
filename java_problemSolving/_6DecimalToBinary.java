package java_problemSolving;

import java.util.Scanner;

public class _6DecimalToBinary {
    public static void main(String args[]){
        int i=0,N,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        N = sc.nextInt();
        int[] a = new int[N];
        System.out.print("Enter the nummber to find binary: ");
        int M = sc.nextInt();
        sc.close();

        while(M>0){
            r = M%2;
            a[i] = r;
            M=M/2;
            i++;
        }
        for(i=i-1;i>=0;i--){
            System.out.print(a[i]);
        }
        System.out.println();

    }

    
    
}
