package _11Inheritence;
//try to understand the annotation https://www.geeksforgeeks.org/annotations-in-java/ 
//method call will be exexueted based on arguements if you multiple same method understanding the variable arguements
//got to line 15 to understand it
class Super{
    void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
    @Override
    void display(){
        System.out.println("Sub Class Display");
    
    }
    //try this
   /*  void display(int x){
        System.out.println("Sub Class Display");
    }*/
}

public class _5InheritenceMethodOverriding {
    public static void main(String...args){
        //creating object of Super class
        Super su=new Super();
        su.display();
        //creating object of Sub class
        Sub s=new Sub();
        s.display(); 
        //understanding dynamic method dispatch
        //creating reference of super class
        //creating object of sub class
        System.out.println("-------------- ------------- ----------");
            Super su1 = new Sub();
            su1.display();

        System.out.println("-------------- ------------- ----------");

    }
    
}
