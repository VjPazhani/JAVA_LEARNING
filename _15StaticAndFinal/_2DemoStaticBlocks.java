package _15StaticAndFinal;
//static method are first will execuete in main class when class loaded
public class _2DemoStaticBlocks {
    static{
        System.out.println("Block1");

    }
    static{
        System.out.println("Block2");

    }
    public static void main(String ... args){
        System.out.println("MAIN");

    }
}
//Try these understand the ways os static call
/*//static methhod are execuete in first are last it will decide which position that class loaded
class Test{
    static{
        System.out.println("Block1");

    }
    static{
        System.out.println("Block2");

    }
}
public class _2DemoStaticBlocks {
    
    public static void main(String ... args){
        System.out.println("MAIN");
        Test t=new Test();

    }
}
*/