package _9Method.ProblemSolvingUsingMethod;
import java.util.*;
public class MaximumElementInArray{
    static int  maxArray(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.printf("The maximum value is %d\n",max);

        return max;
       }       public static void main (String[] args){
        System.out.printf("Enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the value of array a[%d]: ",i);
                a[i]=sc.nextInt();
        }
        sc.close();

        maxArray(a);

    }
}