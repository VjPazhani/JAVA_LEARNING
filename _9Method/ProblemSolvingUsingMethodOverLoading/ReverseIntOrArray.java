package _9Method.ProblemSolvingUsingMethodOverLoading;

import java.util.Scanner;

public class ReverseIntOrArray {
    static void reverseIntOrArray(int n){
        int temp,rev=0,rem;
        temp=n;
        while(temp!=0){
            rem=temp%10; 
            rev = rev*10+rem;
            temp=temp/10;
        }
        System.out.printf("The reverse of %d is %d\n",n,rev);

    }
    static void reverseIntOrArray(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.printf("%d,\t",a[i]);
        }
        System.out.println("");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the integer to reverse:");
        int a=sc.nextInt();
        System.out.println("");
        System.out.printf("Enter the size of array: ");
        int n=sc.nextInt();
        int b[]= new int[n];
        for(int i=0;i<b.length;i++){
            System.out.printf("Enter the value of array a[%d] ",i);
            b[i]=sc.nextInt();
        }
        sc.close();
        System.out.printf("Printing the original array: ");
            for(int i=0;i<b.length;i++){
            System.out.printf("%d,\t",b[i]);
        }
        System.out.println("");
        System.out.println("========= =============");
        System.out.printf("Printing the original array: ");
         reverseIntOrArray(b);
        System.out.println("========= ============= ============");
        reverseIntOrArray(a);
    }
}
