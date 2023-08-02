package _17ExceptionHandling;
//finally block is execueted if there is exeception as well as there is no exeception
//if we don't handling exedeption we need finally block
public class _7FinallyExeception {
    static void meth1() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("Final block");
            
    }
    }
    public static void main(String ... args) throws Exception{
        /*1.try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final block");
        }
        */
        meth1();
    }
    
}
