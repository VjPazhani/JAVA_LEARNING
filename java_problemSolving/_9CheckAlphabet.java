package java_problemSolving;

import java.util.Scanner;

public class _9CheckAlphabet{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the Charecter: ");
        char ch = in.next().toLowerCase().charAt(0);
        if(ch>= 97 && ch<=122 ){
            System.out.format("%c is a alphabet\n",ch);
        }
        else{
            System.out.format("%c is not a alphabet\n",ch);

        }
    in.close();

    }
}