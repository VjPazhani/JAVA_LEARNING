//program to print the sum of natural number
package java_problemSolving;

import java.util.Scanner;

public class _10SumOfNatural {
    public static void main(String args[]){
        int i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = in.nextInt();
        in.close();
        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("Sum of %d is %d\n",n,sum);


    }
}
