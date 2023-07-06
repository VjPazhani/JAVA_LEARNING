package _8Array;
import java.util.*;
public class _15SortingStringArrays {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the String array size: ");
        int n =sc.nextInt();
        String a[]= new String[n];
        for(int i=0;i<n;i++){
            System.out.printf("Enter the String Object \na[%d]: ",i);
            a[i]=sc.nextLine();
        }
        sc.close();
        for(int i=0;i<n;i++){
            System.out.printf("'%S'\t",a[i]);
        }
        java.util.Arrays.sort(a);
        System.out.println("The Sorting of String arrays: ");
        for(String x:a){
            System.out.printf("'%S'\t",x);
        }

            }
        }

