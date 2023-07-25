package _14InnerClass;

class Outer1{
    public void display1(){
        class Inner{
             public void show(){
            System.out.println("Hi there");
        }
    }
    //u can declare anonymous object like "new Inner.show"
    Inner i = new Inner();
    i.show();
    }
}
public class _2demoLocalinnerClass {
    public static void main(String []args){
        Outer1 o = new Outer1();
        o.display1();
    }
}
