//----------static method can call only  static method;---------------------
package _9Method;

public class PracticeMethod1 {
    //change int to double for understanding the dtatype
     static int max(int x,int y){ //x and y is formal parameter
        if(x>y)
            return x;
        else
            return y;
     }
     public static void main(String args[]){
            int a=4,b=9;
            //method calling
            
            System.out.println(max(a,b));//a and b is a actual parameter);
     }
}
