package _17ExceptionHandling;
//nested try catch block 
public class _3NestedExeception {
    public static void main(String [] args){
        //declare the array
        int a[]={23,44,66,77,88,0};
        try{
            int c= a[0]/a[5];
            System.out.println(c);
            try{
            System.out.println(a[6]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
       
        System.out.println(a[3]);
        System.out.println("Bye");

    }
    
}
/* public static void main(String [] args){
        //declare the array
        int a[]={23,44,66,77,88,0};
        try{
            int c= a[0]/a[2];
            System.out.println(c);
            try{
            System.out.println(a[6]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
       
        System.out.println("Bye");

    }*/