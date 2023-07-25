package _9Method;

public class PracticeMethodVariableArguements1 {
    static void showList(String...S){
        for(int i=0;i<S.length;i++){
            System.out.println(i+1+". "+S[i]);
        }
    }
    public static void main(String ...args){ //we can put String[]arg
        showList("Raj","Pazhani","Raja","Kani");

    }
    
}
/*
 * Run this for better understanding
 *   static void showList(int start,String...S){
        for(int i=0;i<S.length;i++){
            System.out.println(start". "+S[i]);
        }
    }
    public static void main(String ...args){ //we can put String[]argd
        showList(5,"Raj","Pazhani","Raja","Kani");

    }
    
 */
