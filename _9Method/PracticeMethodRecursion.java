package _9Method;

public class PracticeMethodRecursion {
    //Recursion is a function and it call itself until some condition satisfies
    static void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
            /*Output of this program
                3
                2
                1
             */
        }
    }
    public static void main(String[] args){
        fun(3);
    }
    /* static void fun(int n){
        if(n>0){
            
            fun(n-1);
            System.out.println(n);

        }
    }
    public static void main(String[] args){
        fun(3);
    
        Output of this program:
        1
        2
        3
    } */
}
