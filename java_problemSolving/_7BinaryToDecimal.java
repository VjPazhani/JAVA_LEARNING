package java_problemSolving;

import java.util.Scanner;

public class _7BinaryToDecimal {
    public static void main(String args[]){
        int i=0,temp,sum=0,N,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        N = sc.nextInt();
        temp=N;
        while(temp!=0){
            r=temp%10;
            sum=sum+r * (int)Math.pow(2,i);
            temp=temp/10;
            i++;

        }
        System.out.format("Decimal nummber for %d is %d\n",N,sum);
        sc.close();
    }

    
}
