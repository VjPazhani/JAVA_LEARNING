package _15StaticAndFinal;
//u cna override the final class and final method
//final class Test
class Test{
    final void display(){

    }
}
class Test1 extends Test{
    //void display(){}
}
public class _3FinalKeyword {
    //u can't declare the identifier without intialization in member of class
    //u can use instance block intialize
    //three ways of intialization
    //1.directly intialization
    final int RADIUS=5;
    //2.Within constructer block
    final int RAD;
    {
        RAD=6;
    }
    //3.Within constructer
    final int WITH;
    public _3FinalKeyword(){
        WITH=8;
    }


    public static void main(String [] args){
        //u can declare final identifier an then assign value
        final float PI;
        PI =3.1225f;
        System.out.println(PI);
    }
    
}
