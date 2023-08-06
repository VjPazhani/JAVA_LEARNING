//passing object as a parameter
package _9Method;

public class PracticeMethod3 {
    //String is immutable so we get array as a object for more understanding go to datatype introductio
    //In main method a[] is created in stack and its value created in heap
    static void update(int b[]){ //we put void so it return nothing
        b[0]=25; //this reference a[] different from main method references a[]
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};//first in this array value passed to formal parameter in the update method
        update(a);
        System.out.println(a[0]);//this does not print entire array because it doesn't have any loop;
    }
}
//important note the actual paramter pass only address to formal paremeter
//now the formal parameter as a address and it als o point the same objetc that actual parameter 
