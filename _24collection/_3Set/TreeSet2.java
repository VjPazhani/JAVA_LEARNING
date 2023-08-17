package _24collection._3Set;

import java.util.TreeSet;
//go and view the java documentation for what is treeset
public class TreeSet2 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> ts=new TreeSet<>();
        //Collection<Integer> ts1=new TreeSet<>();

        ts.add(10);
        ts.add(23);
        ts.add(23);
        //ts.add(30);
        ts.add(45);
        ts.add(15);
        ts.add(25);

        System.out.println(ts);//it implements sortedset,collection 
        System.out.println(ts.ceiling(30));//it print the highest
    }
}
