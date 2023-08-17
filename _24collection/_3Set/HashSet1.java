package _24collection._3Set;

import java.util.HashSet;
//hashset is the implementation of interface collection and set and also using hashing technique
public class HashSet1 
{

    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<>(10,0.5F); //we can use loading factor by using this constructer only 5 elements allowed to store in hashset balance will be blanck space 
        //if u adding so many elements than size then the actual size will changes
        hs.add(10);
        hs.add(15);
        hs.add(42);
        hs.add(21);
        hs.add(20);
        hs.add(20); //it does not print duplicate and storing elements in unindexed fashion
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(15);
        hs.add(16);

         System.out.println(hs);
         System.out.println(hs.size());

    }   
}
