package _9Method;

public class PracticeMethod2 {
    int max(int x,int y){ //x and y is formal parameter
        if(x>y)
            return x;
        else
            return y;
     }
     //always declare main method as a static
     public static void main(String args[]){
            int a=4,b=9;
            //method callingmax 
           // c=max(a,b);//this actual parameter
            //System.out.println(c);
            //creating a object for an classs
            PracticeMethod2 pm = new PracticeMethod2();
            //then call the method note eliminate the static word

        System.out.println(pm.max(a, b));


     }
}

    /*int max(int x,int y){ //x and y is formal parameter
        if(x>y)
            return x;
        else
            return y;
     }
     public static void main(String args[]){
            int a=4,b=9;
            //method calling
           // c=max(a,b);//this actual parameter
            //System.out.println(c);
            //creating a object for an classs
            PracticeMethod2 pm = new PracticeMethod2();
            //then call the method note elimonate the static word
        System.out.println(pm.max(a, b));]
        

     }*/
     
     
    

     /*--------------------run it to understand---------------
     ------------this program helps to understand parameter passing
     ----------this call by reference -------------------
     static void inc(int x){
        x++;
        System.out.println(x);
     }
     public static void main(String arg[]){
        int a=10;
        inc(a);
        System.out.println(a);
     }*/

