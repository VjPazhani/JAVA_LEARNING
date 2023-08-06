package _20Annotation;
//user - defined annotation
//it can defined like interface
//import java.lang.annotation.Annotation; //annotation are automatically inherited from class annotation 

@interface MyAnno{
    //metadata data about data
    //it will defined by elements
    String name(); //inside annotation mrthod called as elements
    String project();
    String date(); 
    String version() default "13"; //default is used for not mandatory
}
@MyAnno(name = "Smith",project="Bank",date="1/1/2011") //annotation used in class level
public class _3UserdefinedAnnotation {
     @MyAnno(name = "Smith",project="Bank",date="1/1/2011",version="13") //annotation used in method level
    public static void main(String[] args) {
        
        @MyAnno(name = "Smith",project="Bank",date="1/1/2011",version="13") //annotation used in local variable level
        int x=10;
    }
}
