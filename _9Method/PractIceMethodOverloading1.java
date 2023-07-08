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
            call it,the class does not having double method but having float method. error message
            will shown in program.float method consider only if it specify in arguements with its
            format specifier like max(10f,23f);
        */
    /*static int max(int a,int b){
        return (a>b) ? a:b;
    }*/
    static byte max(byte a,byte b){
        return (a>b) ? a:b;
    }
    static float max(float a,float b){
        return (a>b) ? a:b;
    }
    static int max(int a,int b,int z){
        return (z>(a>b ? a: b)? z: (a>b ? a : b));
    }
    public static void main(String args[]){
        //if we put numberr in actual parameter compiler put automaticlly arguements
        System.out.println("--------------Printing the int method ------------");
/*        System.out.println("--------------try to print the byte method  without intialize byte variable but it call the float method------------");
        but it call the float method not call the byte methhod because integer is compatible with float
 */

        System.out.println(max(10,67));
        System.out.println("--------------Printing the float method ------------");
        System.out.println(max(15f,47f));
        System.out.println("--------------Printing the int method with three parameter ------------");
        System.out.println(max(15,47,109));
    System.out.println("Calling method with same name but it performs various operations.It denotes that max acts as a Polymorphism");

        /* ---run it for understandin the double literal---------------
        System.out.println("--------------Printing the float method without specify the format parameter ------------");
        System.out.println(max(15.43,47.55)); 
        */




    }
}