package _14InnerClass;
class Outer3{
    static int X=10;
    int Y=20;
    static class My{
        void show(){
            System.out.println(X);
            //System.out.println(Y);
        }
    
    }
    
}
public class _4demoOfStaticClass {
    public static void main(String ...args){
        //we call the static inner class wihout creating a outer class object
        Outer3.My o = new Outer3.My();
        o.show();
    }
    
}
