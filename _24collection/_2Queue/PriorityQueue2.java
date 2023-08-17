package _24collection._2Queue;
import java.util.*;
public class PriorityQueue2
{
    public static void main(String[] args)
     {
        PriorityQueue<Integer> pr= new PriorityQueue<>();

        pr.add(20);
        pr.add(30);
        pr.add(40);
        pr.add(10);
        pr.add(5);
        pr.add(3);
        pr.add(25);

        pr.forEach((x)-> System.out.println(x));

        pr.poll();
        pr.poll();
        System.out.println("After Deleting");

        pr.forEach((x)-> System.out.println(x));

    }
}
/*
    2. changing the priority using generic class of comparator
 * class MyComparator implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {   
            if (o1>o2) 
                return -1;
            if(o1<o2)
                return 1;
            return 0;
    }
}
public class PriorityQueue2
{
    public static void main(String[] args)
     {
        PriorityQueue<Integer> pr= new PriorityQueue<>(new MyComparator());

        pr.add(20);
       

        pr.forEach((x)-> System.out.println(x));

        pr.poll();
        System.out.println("After Deleting");

        pr.forEach((x)-> System.out.println(x));

    }
}
 */