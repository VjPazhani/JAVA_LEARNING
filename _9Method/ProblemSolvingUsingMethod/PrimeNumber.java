package _9Method.ProblemSolvingUsingMethod;

import java.util.Scanner;

public class PrimeNumber {
    static int isPrime(int m){
        int flag=0;
        if(m==0 || m==1){
            flag=1;
        }
        for(int i=2;i<m;i++){
            if(m%i==0){
                flag=1;
            }
        }
        if(flag==0)
            System.out.printf("%d is prime\n",m);
        else
            System.out.printf("%d is not a prime\n",m);
        return m;

    }
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number: ");
        n=sc.nextInt();
        isPrime(n);
        sc.close();
    }


    
}
