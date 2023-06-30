package java_problemSolving;
import java.util.*;;
public class _11Factorial {
    public static void main(String args[]){
        int i,n,fact=1;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        n= in.nextInt();
        in.close();
        for(i=1;i<=n;i++){
            fact*=i;
        }
        System.out.printf("Factorial of %d is %d\n",n,fact);
    }
}
