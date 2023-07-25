package _14InnerClass;
//watch video of anonymous class
abstract class My{
    abstract void meth1();
    
}
class Outer2{
    public void dislplay(){
         My m = new My(){public void meth1(){System.out.println("Hello");}};
          // The above line this anonymous class reference and anonymous object innherited from class MY

         m.meth1();
         //important poin we create reference for abstract class for creating a concrete methos
         //so we call meth();
         //try this
         // new  new My(){public void meth1(){System.out.println("Hello");}}
          }
    
}

public class _3AnonymousClass {
    public static void main(String ...a){
        Outer2 o= new Outer2();
        o.dislplay();
    }
    
}
