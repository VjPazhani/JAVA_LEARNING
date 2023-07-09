package _9Method.ProblemSolvingUsingVarArgs;
public class MaxVarArgs {
    static int max(int ...A){
        if(A.length==0){
            return Integer.MAX_VALUE;
        }
        int max_element=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max_element)
                max_element=A[i];
        }
        return max_element;
    }
    public static void main (String...args){
        System.out.println("The Maximum elment is "+max(50,40,60,74865,46647));//pass zero ass a arguements
        

    }
}
