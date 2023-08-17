package _23Generics;
//problem in object class
@Deprecated
public class _1demo 
{
    public static void main(String[] args) throws Exception
    {
        Object obj=new String("new");
        obj = new Integer(10);//remove this line and execuete it
        String str=(String)obj;
        System.out.println(str);
        System.out.println(obj);

    }
}
/* if you have an reference of an object class you can assign any type of object but when u have to get original datatype u should type cast
*   object class is used for generalization
    but there is no type safety
 * Object obj=new String("new");
        obj = new Integer(10);
        String str=(String)obj;
*/