package java_problemSolving;
import java.util.*;
public class _8LeapYear{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the Year: ");
        int year = in.nextInt();
        if(year%400==0){
            System.out.format("%d is a Leap year\n",year);
        }
        else if(year%100==0){
            System.out.format("%d is not a Leap year\n",year);
    }
        else if(year%4==0){
            System.out.format("%d is a Leap year\n",year);
        }
        else{
            System.out.format("%d is not a leap year\n",year);
        }
        in.close();
}
}






