package _24collection._1list;
import java.util.*;
public class ArrayList1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al1=new ArrayList<>();
        //4.static method for creating list
        ArrayList<Integer> al2=new ArrayList<>(List.of(30,40,60,80,40,200));
        //1.
        al1.add(10);
        //2.
        al1.add( 0,20);
        //3.
        al1.addAll(1,al2);

        //6.
        System.out.println(al1.contains(200));
        System.out.println(al1.contains(100));

        //7.
        System.out.println(al1.get(3));
        //8.
        System.out.println(al1.indexOf(40));
        System.out.println(al1.indexOf(70));
        //9.
        System.out.println(al1.lastIndexOf(40));
      
        //10.
        al1.set(2, 1000);
        //5.
        System.out.println(al1);
        
        //11.Iteration method1
         System.out.print("[");//important

            for(int i=0;i<al1.size();i++)
            {

             System.out.print(" "+al1.get(i));//important
                
            }
            System.out.println(" ]");//important

        //12.Iteraation method2
            for(var x:al1) //for(var x:al1)
            {
             System.out.print(" "+x);

            }
            System.out.println();

        //13.Iteration method3 function operation
            al1.forEach(
                (x) ->{
                    System.out.printf(" "+x);
                }
            );
            System.out.println(" ");

        //14.Iteration method4 Interface Iterator

        Iterator<Integer> it=al1.iterator();it.hasNext();

        while(it.hasNext()){
            System.out.print(" "+it.next());
        }
        System.out.println(" ");

        //15.Iteration method4 Interface ListIterator

       for( ListIterator<Integer> it1=al1.listIterator();it.hasNext();) //it.hasNext();important poin because it
             System.out.print(" "+it1.next());
            System.out.println(" ");


        //---------important method------------------

        al1.forEach(n ->show(n));
    }
    static void show(int n)
    {
        if(n>30)
        System.out.println(n);
    }
}
