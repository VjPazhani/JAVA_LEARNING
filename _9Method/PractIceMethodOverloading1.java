package _9Method;

public class PractIceMethodOverloading1 {
    /*you need to understand the literal topic first 
     * In basic,numbers without decimal comes from integer literal
     * like passing arguements in actual parameter wiht out specifying the datatypes max(10,8)
     * it will be comsidered as integer literal not  considered as byte or short 
     * byte and short  will condidered only if it specify in arguements
     * ---------suppose if we call a method with max(10,30) but not having int method 
        but having  byte and float method then main will call the float method because integer
        is compatible with float    
    ---------suppose we call method with by max(2.5,3.5) it will search the double method and
            call. If the class does not having double method but having float method. error message
            will shown in program.float method consider only if it specify in arguements with its
            format specifier like max(10f,23f);
        */
        /* static int max(int a,int b){
        System.out.println("Printing the Int method");

        return (a>b) ? a:b;
    }*/
    
    static byte max(byte a,byte b){
        System.out.println("Printing the Bytemethod");

        return (a>b) ? a:b;
    }
    static float max(float a,float b){
        System.out.println("Printing the Float method");

        return (a>b) ? a:b;
    }
    static int max(int a,int b,int z){
        System.out.println("Printing the Int method");

        return (z>(a>b ? a: b)? z: (a>b ? a : b));
    }
    public static void main(String args[]){
        //if we put numberr in actual parameter compiler put automaticlly arguements
/*        System.out.println("--------------try to print the byte method  without intialize byte variable but it call the float method------------");
        but it call the float method not call the byte methhod because integer is compatible with float
 */     
         byte a=20,b=30;
        System.out.println(max(a,b));
        System.out.println(max(10,67));
        System.out.println(max(15f,47f));
        System.out.println(max(15,47,109));
        
        /* ---run it for understandin the double literal---------------
        System.out.println("--------------Printing the float method without specify the format parameter ------------");
        System.out.println(max(15.43,47.55)); 
        */




    }
}
