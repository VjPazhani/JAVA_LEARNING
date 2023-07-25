package _14InnerClass;


class Outer{
    int X=10;
    int sum=0;
        //u can create Object of inner above decclaration of inner  class
        //Inner i = new Inner();
        class Inner{
            int Y=20;
                int innerDisplay(){
                    //you can access directly the x variable
                    return sum=X+Y;
                   // System.out.println("The value of X is "+X);
                   // System.out.println("The value of Y is "+Y);
                    


                }
        }
    void outerDisplay(){
        //you can't access directly inner class  Y variable unless u create object of inner class
        //System.out.println("The value of Y is "+Y);
    Inner i = new Inner();
        i.innerDisplay();

        System.out.println("The value of Y is "+i.Y);


        
    }
}
public class _1demoOfInnerClass {
    public static void main(String ... args){
        //creating object of  class Outer
        Outer o=new Outer();
        o.outerDisplay();
        System.out.println("The value of X is "+o.X);
        //by printing the sum value
        //u can't use the object of inner class directly
        //try it above situation
        //Inner i=new Inner();
        Outer.Inner oi = new Outer().new Inner();
        System.out.println("The Sum  is "+oi.innerDisplay());


    }
}
