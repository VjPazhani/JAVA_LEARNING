package _19JavaLangPackage;

public class _1WrapperDemo 
{
 public static void main(String [] args) 
 {
     //int is the primitive datatype
    //primitve are not object because doesn't use dote operater
    //primitve is build in datatype
    
    //java provide wrapper class to use primitive as object

    //Number class is child class of a parent class
    //Integer,Byte,Float,Double,Charecter,Boolean are the child class of Number class

    //Integer i=new Integer(10); this method is deprecated
    Integer a=Integer.valueOf(10);
    Integer b=40;

    Byte c=16;
    //i can give string type value in byte 
    Byte d=Byte.valueOf("15");

    //this autoboxing
    byte bb=15;
    Byte e=Byte.valueOf(bb);
    /*
     bb is a variable
     e created the bb as a object like box inside inside the object it contains bb=15
     e is the reference to that object
     */

    Short f=Short.valueOf("123");
    short ff=123;
    Short g=Short.valueOf(ff);

   Double i=Double.valueOf("123.456");

  // Character j=Character.valueOf("I"); 
  Character j=Character.valueOf('I');

  //auto unboxing
    Float k=Float.valueOf("123.44");
    float l=k.floatValue();
    //here k is object 
    // and object is assigned into primitive variable
    //so it is called autounboxing
    float m=k;


 }
}
