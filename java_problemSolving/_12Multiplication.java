package java_problemSolving;

import java.util.Scanner;

public class _12Multiplication {
    public static void main(String args[]){
        int range,i;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        range = sc.nextInt();
        sc.close();

        for(i=1;i<=range;i++){
            System.out.printf("%d * %d = %d\n",i,range,i*range);
        }

    }
}
