package _19JavaLangPackage;

//Reflection is used to know about details of class
import java.lang.reflect.*;

class My
{
    //data members
    private int a;
    protected int b;
    public int c;
    int d;

    //constructer
    public My(){};
    public My(String s1,String s2){};

    //methods
    public void display(String q1,String q2){}
    public int meth1(int x,int y){return 0;}
}
public class _8ReflectPackage {
    public static void main(String[] args) {
        //transfer My class into class
        Class c=My.class;

        System.out.println(c);
        System.out.println(c.getName());

        System.out.println("=============== ================= ===============");

        //printin the fields
        Field field[]= c.getDeclaredFields();

        for(Field x:field)
            System.out.println(x);
        System.out.println("=============== ================= ===============");

        //printing the constructers
        Constructor co[]=c.getConstructors();

        for(Constructor y:co){
            System.out.println(y);

        }
        System.out.println("=============== ================= ===============");
        //printing the methods
        Method m[]=c.getMethods();
        for(Method z:m){
            System.out.println(z);
        
    }
    System.out.println("=============== ================= ===============");
    //printing the parameter
        Parameter param[]=m[1].getParameters();
        for(Parameter z:param){
            System.out.println(z);
}
System.out.println("=============== ================= ===============");

}
}
