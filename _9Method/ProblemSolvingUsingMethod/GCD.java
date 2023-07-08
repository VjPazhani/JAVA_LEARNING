package _9Method.ProblemSolvingUsingMethod;
//try gcd anotheer method
import java.util.Scanner;

public class GCD {
    static void theGCD(int m1,int m2,int gcd){
        for(int i=1;i<=m1&&i<=m2;i++){
            if(m1%i==0 && m2%i==0){
                 gcd=i;
            }
        }
        System.out.printf("The GCD Of %d and %d is %d\n",m1,m2,gcd);
        
    }
    public static void main(String args[]) {
        int n1,n2,gcd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n1 and n2: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        theGCD(n1,n2,gcd);
        sc.close();
    }

}

