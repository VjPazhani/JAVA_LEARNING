package _13Interfaces;
interface Test{
    //1.By default they are public and abstract
    void meth1();
    //you can't method declare in private
    public abstract void meth2();
    //2.Be fault identifier are static and final
    //we can use the interface in uppercase so it is easy to understand that identifier are from interface
    // X is a identifier
    final static int X=10;
    int Y=20;
    //by default can't have method body
    //try to run this 
    /* void meth3(){
        System.out.println("hi");
    }*/
    //3. In interface you can have static method
   public static void meth3(){
        System.out.println("hi");
    }
    //go to main and try to acces the interface identifier without creating object

    //5.suppose you doing a big project you want to modify the interface by adding new method No you cannot modify
    //supose you update and modify the interface without distrubing the existing class yo can declare method in default

    default void meth5(){
        System.out.println("hi there");

    }
    //6. you can use the private method but it should not abstract
    //private method are used internall in interface by default method
    private void meth6(){
        System.out.println("Private method");
        
    }
    default void meth7(){
        meth6();
    }
}
    //4.you can extend the interface

interface Test2 extends Test{
    void meth4();
    //go to create default method
}
class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
    //you can override the default override the default method in existing class
    //try to run this
    /*public void meth5() {
        System.out.println("hi heloo0000000000");

    } */
}
public class _3DOsAndDontInterface {
    public static void main(String []args){
        System.out.println(Test.X); //because it is static so we directly access the interface with dot operater
        //go to create interface Test2
        My m= new My();
        m.meth5();
        //m.meth6();
        m.meth7();
    }
    
}
