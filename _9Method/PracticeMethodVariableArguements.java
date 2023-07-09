package _9Method;
//you should not pass varargs in first it always put in last in arguements
// example the crt form is  static void show(int A,int ...A) and non correct form is  static void show(int ...A,intA) try in program to understand
public class PracticeMethodVariableArguements {
    static void show(int ...A){ //int ...A is called as varargs
        //it means it passing numerous parameter in array form you should not put like int a[]

        for(int x:A){
            System.out.println(x);
        }
    }
 public static void main(String[] args) {
    show();
    show(10,30,30);
    //suppose we passing array
    show(new int[]{67,49,100,2345,66666}); //this array is created
    //normally we decalare like int a[]=new int[28];
    //a[] act as a reference normally
    //but in variable arguements it called anonymous array that means it created for that time being for using
    
}
    
}
