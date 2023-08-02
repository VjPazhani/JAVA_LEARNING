package _17ExceptionHandling;
//Multiple catch block
public class _2MultipleExcecption {
    public static void main(String [] args){
        //declare the array
        int a[]={23,44,66,77,88,0};
        try{
            int c= a[0]/a[5];
            System.out.println(c);
            System.out.println(a[6]);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(a[3]);
        System.out.println("Bye");

    }
    
}
//if u run thi program the try block only execuete the arithmetic exeception
//it didin't execuete the next exeception
//run it for understanding
