package _9Method.ProblemSolvingUsingVarArgs;
import java.util.*;
public class SumOfElements {
    static  int sum(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }

public static void main(String ...args){
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter the size: ");
    int n =sc.nextInt();
    System.out.println("");
    int A[]=new int[n];
    for(int i=0;i<A.length;i++){
        System.out.printf("Enter the Value of array A[%d]: ",i);
        A[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("The Sum Of Elements is "+sum(A));
}
    
}
