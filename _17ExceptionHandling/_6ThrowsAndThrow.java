package _17ExceptionHandling;

class NegativeDimensionsExeception extends Exception{
    public String toString(){
    return "Length and breadth dimension can't be negative or zero";
   }
}

public class _6ThrowsAndThrow {
   
    static int area(int l,int b ) throws NegativeDimensionsExeception
    {
        if(l<0||b<0)
            throw new NegativeDimensionsExeception();
        int a = l*b;
        return a;
    }
    static void meth1() throws NegativeDimensionsExeception
    {
       // System.out.println("Area is "+area(10,6));
        System.out.println("Area is "+area(10,-6));
    }
    public static void main(String ... args) throws NegativeDimensionsExeception
    {
        try{
        meth1();
        }
        catch(NegativeDimensionsExeception e){
            //System.out.println(e);
            System.out.println(e);
            
        }
    }
    
}
